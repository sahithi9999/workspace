import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'first123'
})
export class First123Pipe implements PipeTransform {

  transform(val : number) : number {
    return Math.sqrt(val);

    
  }

}
