import './vendor.ts';

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { Ng2Webstorage } from 'ng2-webstorage';

import { SmartcrowdSharedModule, UserRouteAccessService } from './shared';
import { SmartcrowdAppRoutingModule} from './app-routing.module';
import { SmartcrowdHomeModule } from './home/home.module';
import { SmartcrowdAdminModule } from './admin/admin.module';
import { SmartcrowdAccountModule } from './account/account.module';
import { SmartcrowdEntityModule } from './entities/entity.module';
import { customHttpProvider } from './blocks/interceptor/http.provider';
import { PaginationConfig } from './blocks/config/uib-pagination.config';

// jhipster-needle-angular-add-module-import JHipster will add new module here

import {
    JhiMainComponent,
    NavbarComponent,
    FooterComponent,
    ProfileService,
    PageRibbonComponent,
    ActiveMenuDirective,
    ErrorComponent
} from './layouts';

@NgModule({
    imports: [
        BrowserModule,
        SmartcrowdAppRoutingModule,
        Ng2Webstorage.forRoot({ prefix: 'jhi', separator: '-'}),
        SmartcrowdSharedModule,
        SmartcrowdHomeModule,
        SmartcrowdAdminModule,
        SmartcrowdAccountModule,
        SmartcrowdEntityModule,
        // jhipster-needle-angular-add-module JHipster will add new module here
    ],
    declarations: [
        JhiMainComponent,
        NavbarComponent,
        ErrorComponent,
        PageRibbonComponent,
        ActiveMenuDirective,
        FooterComponent
    ],
    providers: [
        ProfileService,
        customHttpProvider(),
        PaginationConfig,
        UserRouteAccessService
    ],
    bootstrap: [ JhiMainComponent ]
})
export class SmartcrowdAppModule {}
