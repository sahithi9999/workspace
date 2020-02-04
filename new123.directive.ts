import { Directive ,ElementRef} from '@angular/core';

@Directive({
  selector: '[New123]'
})
export class New123Directive {

  constructor(Element: ElementRef) {
  console.log(Element);
      Element.nativeElement.innerText="Text is changed by changeText Directive. ";

}
}
