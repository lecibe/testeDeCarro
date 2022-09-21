package Service;

import Model.Carro;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.not;


public class CarroServiceTest2 {

    @Test
    public void testeVelocidadeDesligado() {

        //Given
        CarroService carroService = new CarroServiceImpl();
        Carro carro1 =
                new Carro("prata", "GM", "2012", "Celta");

        // When
        carroService.acelerar(carro1, 20);

        // Then - TRUE
        Assert.assertTrue(carro1.getVelocidadeAtual() == 0);
    }
        @Test
        public void testeCarroLigado() {
            //Given
            CarroService carroService = new CarroServiceImpl();
            Carro carro1 =
                    new Carro("prata", "GM", "2012", "Celta");

            // When
            carroService.acelerar(carro1, 20);

            // Then - FALSE
            Assert.assertFalse(carro1.isLigado());
        }

        @Test
        public void testeComparacaoCarros() {
            //Given
            CarroService carroService = new CarroServiceImpl();
            Carro carro1 =
                    new Carro("prata", "GM", "2012", "Celta");

            Carro carro2 =
                    new Carro("preto", "GM", "2012", "Celta");

            Carro carro3 =
                    new Carro("prata", "GM", "2012", "Celta");

            // When
            carroService.acelerar(carro1, 20);


            //Then - EQUALS
            Assert.assertNotEquals(carro1, carro2);
            Assert.assertNotEquals(carro2, carro3);

            Assert.assertEquals(carro1, carro3);

            Assert.assertNotSame(carro1, carro3);
        }

        @Test
        public void testeCor() {
            //Given
            CarroService carroService = new CarroServiceImpl();
            Carro carro1 =
                    new Carro("prata", "GM", "2012", "Celta");

            Carro carro2 =
                    new Carro("preto", "GM", "2012", "Celta");

            // When
            carroService.acelerar(carro1, 20);

            //Then THAT
            Assert.assertThat(carro1.getCor(), is(equalTo("prata")));

            Assert.assertThat(carro2.getCor(), is(not("prata")));

        }

    }
