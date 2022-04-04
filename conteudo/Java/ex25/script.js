var expressao ='';
      var memoria = ''; 
      document.querySelectorAll('.numero').forEach(item => {
          
          item.addEventListener('click',event => {
             
              switch(item.innerHTML){
                     
                  case '=':
                     document.getElementById('expressao').innerHTML = document.getElementById('expressao').innerHTML + ' = ';
                     document.getElementById('resultado').innerHTML = eval(expressao);
                      expressao = '';
                  break;
                  case 'MC':
                      memoria = '';
                  break;
                  case 'MR':
                      if(memoria != ''){
                         expressao += memoria;
                          document.getElementById('resultado').innerHTML = '';
                          document.getElementById('expressao').innerHTML = expressao;
                      }
                  break;
                  case 'M+':
                      if(document.getElementById('resultado').innerHTML != ''){
                         
                          if(memoria != ''){
                             memoria = eval(memoria) + eval(document.getElementById('resultado').innerHTML);
                          }else{
                             memoria = eval(document.getElementById('resultado')).innerHTML;
                          }
                         
                      }
                  break;
                  default:
                      expressao += item.innerHTML;
                      document.getElementById('resultado').innerHTML = '';
                      document.getElementById('expressao').innerHTML = expressao;
              }
              
          });
          
      });