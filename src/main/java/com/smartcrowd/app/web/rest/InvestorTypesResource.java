package com.smartcrowd.app.web.rest;

import com.codahale.metrics.annotation.Timed;
import com.smartcrowd.app.config.Constants;
import com.smartcrowd.app.domain.InvestorTypes;
import com.smartcrowd.app.domain.User;
import com.smartcrowd.app.repository.InvestorTypesRepository;
import com.smartcrowd.app.repository.UserRepository;
import com.smartcrowd.app.repository.search.InvestorTypesSearchRepository;
import com.smartcrowd.app.repository.search.UserSearchRepository;
import com.smartcrowd.app.security.AuthoritiesConstants;
import com.smartcrowd.app.service.MailService;
import com.smartcrowd.app.service.UserService;
import com.smartcrowd.app.service.dto.UserDTO;
import com.smartcrowd.app.web.rest.errors.BadRequestAlertException;
import com.smartcrowd.app.web.rest.errors.EmailAlreadyUsedException;
import com.smartcrowd.app.web.rest.errors.LoginAlreadyUsedException;
import com.smartcrowd.app.web.rest.util.HeaderUtil;
import com.smartcrowd.app.web.rest.util.PaginationUtil;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static org.elasticsearch.index.query.QueryBuilders.queryStringQuery;

/**
 * REST controller for managing investortypes.
 * <p>
 * This class accesses the investortypes entity.
 */
@RestController
@RequestMapping("/api")
public class InvestorTypesResource {

    private final Logger log = LoggerFactory.getLogger(InvestorTypesResource.class);

    private final InvestorTypesRepository investorTypesRepository;

    private final InvestorTypesSearchRepository investorTypesSearchRepository;

    public InvestorTypesResource(InvestorTypesRepository investorTypesRepository, InvestorTypesSearchRepository investorTypesSearchRepository) {
        this.investorTypesRepository = investorTypesRepository;
        this.investorTypesSearchRepository = investorTypesSearchRepository;
    }

    /**
     * POST  /investortypes  : Creates a new InvestorTypes.
     * <p>
     * Creates a new InvestorTypes if the login and email are not already used, and sends an
     * mail with an activation link.
     * The user needs to be activated on creation.
     *
     * @param InvestorTypes the user to create
     * @return the ResponseEntity with status 201 (Created) and with body the new InvestorTypes, or with status 400 (Bad Request) if the login or email is already in use
     * @throws URISyntaxException if the Location URI syntax is incorrect
     * @throws BadRequestAlertException 400 (Bad Request) if the login or email is already in use
     */
    @PostMapping("/investortypes")
    @Timed
    @Secured(AuthoritiesConstants.ADMIN)
    public ResponseEntity<InvestorTypes> createUser(@Valid @RequestBody InvestorTypes investorTypes) throws URISyntaxException {
        log.debug("REST request to save investorTypes : {}", investorTypes);

        if (investorTypes.getId() != null) {
            throw new BadRequestAlertException("A new investorTypes cannot already have an ID", "InvestorTypesResource", "idexists");
            // Lowercase the user login before comparing with database
        } else {
            InvestorTypes newInvestorTypes = investorTypesRepository.save(investorTypes);
            return ResponseEntity.created(new URI("/api/investortypes/" + investorTypes.getTypeName()))
                .headers(HeaderUtil.createAlert( "Investor Types saved successfully", investorTypes.getTypeName()))
                .body(investorTypes);
        }
    }
}
