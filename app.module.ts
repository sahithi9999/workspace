import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule} from '@angular/router';
import { HttpModule } from '@angular/http';
import { FormsModule } from '@angular/forms';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NewComponent } from './new/new.component';
import { New123Directive } from './new123.directive';
import { First123Pipe } from './first123.pipe';
import { SqrtPipe } from './sqrt.pipe';
import { MyserviceService } from './myservice.service';







@NgModule({
  declarations: [
    AppComponent,
    NewComponent,
    New123Directive,
    First123Pipe,
    SqrtPipe
  ],
  imports: [
    BrowserModule,
    HttpModule,
    FormsModule,
    RouterModule.forRoot([
      {
         path: 'new',
         component: NewComponent
      }
   ])

  ],
  providers: [MyserviceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
