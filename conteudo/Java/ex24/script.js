
            const jogar1 = document.getElementById('jogar1');
            const jogar2 = document.getElementById('jogar2');

            function troca1 (){

                const nome = document.getElementById('nome').value;
                const snome = document.getElementById('snome').value;
                

                if (nome !== '' && snome !== ''){
                    alert('Nome '+nome+' ' +snome)
                    console.log('Nome '+nome+' ' +snome)
                }

                else {
                    alert('Preencha os campos')
                }

            }

            jogar1.addEventListener('click', troca1);
            jogar2.addEventListener('click', function(){

                setInterval(function(){
                    
                    const nome = document.getElementById('nome').value;
                    const snome = document.getElementById('snome').value;

                    document.getElementById('snome').value = nome
                    document.getElementById('nome').value= snome

                },2000);

            });




