import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculadora extends JFrame {
    private JTextArea entrada;
    private JButton MSButton1;
    private JButton FacButton;
    private JButton Tangente;
    private JButton cButton1;
    private JButton Siete;
    private JButton Cero;
    private JButton Uno;
    private JButton tan1Button;
    private JButton Cuatro;
    private JButton expButton1;
    private JButton Nueve;
    private JButton Seis;
    private JButton Tres;
    private JButton CParentesis;
    private JButton Pi;
    private JButton xButton;
    private JButton cambiosig;
    private JButton logButton1;
    private JButton Porcentaje;
    private JButton XY;
    private JButton AParentesis;
    private JButton CEButton1;
    private JButton Ocho;
    private JButton Dos;
    private JButton Punto;
    private JButton Seno;
    private JButton sin1Button;
    private JButton mButton2;
    private JButton MCButton1;
    private JButton xButton4;
    private JButton Coseno;
    private JButton cos1Button;
    private JButton mButton3;
    private JButton MRButton1;

    private JButton xButton3;
    private JButton xButton1;
    private JButton button3;
    private JButton button5;
    private JButton button6;
    private JButton xButton5;
    private JButton button8;
    private JButton button9;

    private JButton Cinco;

    private JButton Cubo;
    private JButton Cuadrado;
    private JButton RaizCuadrada;
    private JButton RaizCubica;
    private JButton Division;
    private JButton Multiplicacion;
    private JButton Resta;
    private JButton Suma;
    private JButton Igual;
    private JButton a1XButton;
    private JButton a10XButton;
    private JButton eButton;
    private JPanel mainPanel;
    private JTextField salida;
    private JRadioButton radianesRadioButton;
    private JRadioButton sexagesRadioButton;
    private JButton Retroceso;
    private JLabel Memoria;
    private JButton cuadradoPerfectoButton;
    private JButton sumaCuboButton;
    private JButton yButton;


    // VARIABLES
    private boolean igual, comenzar = true, op1, op2;
    private double x, y, z, sin, cos, tan, acos, asin, atan, mem = 0, resultado, v1, v2, a,c;
    private String cad, fun, tpoperacion;

    public Calculadora() {

        setTitle("CALCULADORA");
        setSize(1000, 500);
        setLocationRelativeTo(null);
        setContentPane(mainPanel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        Memoria.setVisible(false);
        //NUMEROS (BOTONES)

        Cero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comenzar == true) {
                    entrada.setText(" ");
                    entrada.setText("0");
                    comenzar = false;
                } else {
                    entrada.setText(entrada.getText() + "0");
                }
            }
        });

        Uno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comenzar == true) {
                    entrada.setText(" ");
                    entrada.setText("1");
                    comenzar = false;
                } else {
                    entrada.setText(entrada.getText() + "1");
                }
            }

        });
        Dos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comenzar == true) {
                    entrada.setText(" ");
                    entrada.setText("2");
                    comenzar = false;
                } else {
                    entrada.setText(entrada.getText() + "2");
                }
            }

        });
        Tres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comenzar == true) {
                    entrada.setText(" ");
                    entrada.setText("3");
                    comenzar = false;
                } else {
                    entrada.setText(entrada.getText() + "3");
                }
            }


        });
        Cuatro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comenzar == true) {
                    entrada.setText(" ");
                    entrada.setText("4");
                    comenzar = false;
                } else {
                    entrada.setText(entrada.getText() + "4");
                }
            }

        });
        Cinco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comenzar == true) {
                    entrada.setText(" ");
                    entrada.setText("5");
                    comenzar = false;
                } else {
                    entrada.setText(entrada.getText() + "5");
                }
            }

        });
        Seis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comenzar == true) {
                    entrada.setText(" ");
                    entrada.setText("6");
                    comenzar = false;
                } else {
                    entrada.setText(entrada.getText() + "6");
                }

            }
        });
        Siete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comenzar == true) {
                    entrada.setText(" ");
                    entrada.setText("7");
                    comenzar = false;
                } else {
                    entrada.setText(entrada.getText() + "7");
                }
            }

        });
        Ocho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comenzar == true) {
                    entrada.setText(" ");
                    entrada.setText("8");
                    comenzar = false;
                } else {
                    entrada.setText(entrada.getText() + "8");
                }
            }

        });
        Nueve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comenzar == true) {
                    entrada.setText(" ");
                    entrada.setText("9");
                    comenzar = false;
                } else {
                    entrada.setText(entrada.getText() + "9");
                }

            }
        });

        //PUNTO
        Punto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (entrada.getText().contains(".")) {

                } else {
                    entrada.setText(entrada.getText() + ".");
                }
            }
        });
        //Funcionalidad del boton Suma
        Suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                igual = true;
                comenzar = true;
                if (op1 = true) {
                    v1 = Double.parseDouble(entrada.getText());
                    salida.setText("");
                    salida.setText(entrada.getText() + "+");
                    op1 = false;
                } else {
                    if (op2 = true) {
                        v2 = Double.parseDouble(entrada.getText());
                        salida.setText("");
                        salida.setText(entrada.getText() + "+");
                        op2 = false;
                    } else {
                        salida.setText(entrada.getText() + "+");
                        operaciones(resultado, v2);
                    }
                }
                tpoperacion = "+";
            }
        });
        //Funcionalidad del boton Resta
        Resta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                igual = true;
                comenzar = true;
                if (op1 = true) {
                    v1 = Double.parseDouble(entrada.getText());
                    salida.setText("");
                    salida.setText(entrada.getText() + "-");
                    op1 = false;
                } else {
                    if (op2 = true) {
                        v2 = Double.parseDouble(entrada.getText());
                        salida.setText("");
                        salida.setText(entrada.getText() + "-");
                        op2 = false;
                    } else {
                        salida.setText(entrada.getText() + "-");
                        operaciones(resultado, v2);
                    }
                }
                tpoperacion = "-";
            }
        });
        //Funcionalidad al boton Multiplicacion
        Multiplicacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                igual = true;
                comenzar = true;
                if (op1 = true) {
                    v1 = Double.parseDouble(entrada.getText());
                    salida.setText("");
                    salida.setText(entrada.getText() + "*");
                    op1 = false;
                } else {
                    if (op2 = true) {
                        v2 = Double.parseDouble(entrada.getText());
                        salida.setText("");
                        salida.setText(entrada.getText() + "*");
                        op2 = false;
                    } else {
                        salida.setText(entrada.getText() + "*");
                        operaciones(resultado, v2);
                    }
                }
                tpoperacion = "*";
            }
        });
        //Funcionalidad al boton Division
        Division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                igual = true;
                comenzar = true;
                if (op1 = true) {
                    v1 = Double.parseDouble(entrada.getText());
                    salida.setText("");

                    salida.setText(entrada.getText() + "/");

                    salida.setText(entrada.getText() + "÷");

                    op1 = false;
                } else {
                    if (op2 = true) {
                        v2 = Double.parseDouble(entrada.getText());
                        salida.setText("");

                        salida.setText(entrada.getText() + "÷");
                        op2 = false;
                    } else {
                        salida.setText(entrada.getText() + "÷");
                        operaciones(resultado, v2);

                        salida.setText(entrada.getText() + "÷");
                        op2 = false;
                    }

                }
                tpoperacion = "/";
            }

        });


        Igual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                igual = true;
                comenzar = true;
                if (igual = true) {
                    if (tpoperacion == null) {
                    } else {
                        v2 = Double.parseDouble(entrada.getText());
                        salida.setText(salida.getText() + entrada.getText());
                        operaciones(v1, v2);
                        igual = false;
                    }
                } else {
                    salida.setText("");
                    operaciones(v1, v2);
                }

            }
        });
        //FUNCIONALIDAD RAIZ CUADRADA
        RaizCuadrada.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v1 = Double.parseDouble(entrada.getText());
                if (v1 >= 0) {
                    salida.setText("√ " + v1);
                    entrada.setText(Math.sqrt(v1) + " ");
                } else {
                    entrada.setText("Math ERROR");
                }
            }
        });

        // FUNCIONALIDAD BOTON PORCENTAJE
        Porcentaje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v2 = Double.parseDouble(entrada.getText());
                salida.setText(salida.getText() + " " + entrada.getText() + "%");
                entrada.setText((v1 * v2) / 100 + " ");
                igual = true;
            }
        });
        //BOTON 1/x
        a1XButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v1 = Double.parseDouble(entrada.getText());
                salida.setText(" " + v1);
                entrada.setText(1 / v1 + " ");
            }
        });
        // CAMBIO DE SIGNO
        cambiosig.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //variables
                double numero1 = 0, numero2, numero3;
                numero2 = Double.parseDouble(entrada.getText());
                numero3 = numero1 - numero2;
                entrada.setText(numero3 + " ");
            }
        });
        //BORRAR
        cButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entrada.setText("0");
                salida.setText("");
                comenzar = true;
                fun = "";
                op1 = true;
                op2 = true;
                igual = true;
                v1 = 0;
                v2 = 0;
                resultado = 0;

            }
        });
        //BORRAR
        CEButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entrada.setText("0");
                salida.setText("");
                comenzar = true;
                fun = "";
            }
        });
        Retroceso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (entrada.getText().length() > 0) {
                    entrada.setText(entrada.getText().substring(0, entrada.getText().length() - 1));
                    if (entrada.getText().length() == 0) {
                        entrada.setText("0");
                        comenzar = true;
                    }
                }
            }
        });

        Seno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fun = "sin";
                Trigonometria();
            }
        });

        Coseno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fun = "cos";
                Trigonometria();
            }
        });

        Tangente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fun = "tan";
                Trigonometria();
            }
        });

        sin1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fun = "-1sin";
                Trigonometria();
            }
        });

        cos1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fun = "-1cos";
                Trigonometria();
            }
        });

        tan1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fun = "-1tan";
                Trigonometria();
            }
        });
        Pi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salida.setText("π ");
                entrada.setText(Math.PI + " ");
            }
        });

        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v1 = Double.parseDouble(entrada.getText());
                salida.setText(v1 + " ^ -1");
                entrada.setText(Math.pow(v1, -1) + " ");

            }
        });
        XY.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comenzar = true;
                v1 = Double.parseDouble(entrada.getText());
                salida.setText(v1 + " ^ ");
                tpoperacion = "p";
                op1 = false;
                comenzar = true;
            }
        });
        Cubo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v1 = Double.parseDouble(entrada.getText());
                salida.setText(v1 + " ^3");
                entrada.setText(Math.pow(v1, 3) + " ");

            }
        });

        FacButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = 1;
                v1 = Double.parseDouble(entrada.getText());
                salida.setText(v1 + "! ");
                for (y = 1; y <= v1; y++) {
                    x = x * y;
                }
                entrada.setText(x + " ");
            }
        });

        // boton e
        eButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salida.setText("E");
                entrada.setText(Math.E + " ");
            }
        });

        //boton raiz cubica
        RaizCubica.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v1 = Double.parseDouble(entrada.getText());
                x = 1;
                y = 3;
                z = x / y;
                salida.setText("cubica( " + v1 + ") ");
                entrada.setText(Math.pow(v1, z) + " ");
            }
        });

        // boton de x elevado al cuadrado
        Cuadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v1 = Double.parseDouble(entrada.getText());
                salida.setText("^2 ( " + v1 + ") ");
                entrada.setText(Math.pow(v1, 2) + " ");
            }
        });

        //boton del 10 al exponente x
        a10XButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v1 = Double.parseDouble(entrada.getText());
                salida.setText("10^x ( " + v1 + ") ");
                entrada.setText(Math.pow(10, v1) + " ");
            }
        });

        //boton exp
        expButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v1 = Double.parseDouble(entrada.getText());
                entrada.setText(Math.exp(v1) + " ");
            }
        });

        //boton log
        logButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v1 = Double.parseDouble(entrada.getText());
                salida.setText("log ( " + v1 + ") ");
                entrada.setText(Math.log(v1) + " ");
            }
        });
        //boton MC
        MCButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mem = 0;
                Memoria.setVisible(false);
            }
        });
        //boton MR
        MRButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entrada.setText(mem + " ");
            }
        });

        //Boton MS
        MSButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mem = Double.parseDouble(entrada.getText());
                Memoria.setVisible(true);
            }
        });
        //Boton M+
        mButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mem = mem + Double.parseDouble(entrada.getText());
                Memoria.setVisible(true);
            }
        });

        //Boton M-
        mButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mem = mem - Double.parseDouble(entrada.getText());
                Memoria.setVisible(true);
            }
        });


        //boton valor absoluto
        xButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v1 = Double.parseDouble(entrada.getText());
                salida.setText("| "+v1+" |");
                entrada.setText(String.valueOf(Math.abs(v1)));
            }
        });

        //parantesis abrir
        AParentesis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comenzar == true) {
                    entrada.setText(" ");
                    entrada.setText("(");
                    comenzar = false;

                } else {
                    entrada.setText(entrada.getText()+"("+" ");
                }
            }
        });

        //parantesis cerrar
        CParentesis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comenzar == true) {
                    entrada.setText(" ");
                    entrada.setText(")");
                    comenzar = false;
                } else {
                    entrada.setText(entrada.getText()+")");
                }
            }
        });
        cuadradoPerfectoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v1 = Double.parseDouble(entrada.getText());
                v2 = Double.parseDouble(entrada.getText());
                salida.setText("( "+v1+"+"+v2+")²");
                entrada.setText(((v1*v1)+(2*v1*v2)+(v2*v2))+ " ");
                igual = true;

            }
        });

        sumaCuboButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                v1 = Double.parseDouble(entrada.getText());
                v2 = Double.parseDouble(entrada.getText());
                salida.setText("( "+v1+"³" + "+"+v2+"³)");
                entrada.setText((v1+v2)*((v1*v1)-(v1*v2)+(v2*v2))+" ");
                igual = true;
            }
        });
    }

        public void Trigonometria() {
            if (sexagesRadioButton.isSelected()) {
                switch (fun) {

                    case "sin":
                        v1 = Double.parseDouble(entrada.getText());
                        salida.setText(" sin( " + v1 + " )");
                        sin = Math.sin(Math.PI * (v1) / 180);
                        entrada.setText(sin + " ");
                        break;

                    case "-1sin":
                        v1 = Double.parseDouble(entrada.getText());
                        salida.setText(" -1sin( " + v1 + " )");
                        asin = Math.asin(v1) * 180 / Math.PI;
                        entrada.setText(asin + " ");
                        break;

                    case "cos":
                        v1 = Double.parseDouble(entrada.getText());
                        salida.setText(" cos( " + v1 + " )");
                        cos = Math.cos(Math.PI * (v1) / 180);
                        entrada.setText(cos + " ");
                        break;

                    case "-1cos":
                        v1 = Double.parseDouble(entrada.getText());
                        salida.setText(" -1cos( " + v1 + " )");
                        asin = Math.acos(v1) * 180 / Math.PI;
                        entrada.setText(acos + " ");
                        break;

                    case "tan":
                        v1 = Double.parseDouble(entrada.getText());
                        salida.setText(" tan( " + v1 + " )");
                        tan = Math.tan(Math.PI * (v1) / 180);
                        entrada.setText(tan + " ");
                        break;

                    case "-1tan":
                        v1 = Double.parseDouble(entrada.getText());
                        salida.setText(" -1tan( " + v1 + " )");
                        atan = Math.atan(v1) * 180 / Math.PI;
                        entrada.setText(atan + " ");
                }
            } else {
                if (radianesRadioButton.isSelected()) {
                    switch (fun) {

                        case "sin":
                            v1 = Double.parseDouble(entrada.getText());
                            salida.setText(" sinR( " + v1 + " )");
                            sin = Math.sin(v1);
                            entrada.setText(sin + " ");
                            break;

                        case "-1sin":
                            v1 = Double.parseDouble(entrada.getText());
                            salida.setText(" -1sinR( " + v1 + " )");
                            asin = Math.asin(v1);
                            entrada.setText(asin + " ");
                            break;

                        case "cos":
                            v1 = Double.parseDouble(entrada.getText());
                            salida.setText(" cosR( " + v1 + " )");
                            cos = Math.cos(v1);
                            entrada.setText(cos + " ");
                            break;

                        case "-1cos":
                            v1 = Double.parseDouble(entrada.getText());
                            salida.setText(" -1cosR( " + v1 + " )");
                            asin = Math.acos(v1);
                            entrada.setText(acos + " ");
                            break;

                        case "tan":
                            v1 = Double.parseDouble(entrada.getText());
                            salida.setText(" tanR( " + v1 + " )");
                            tan = Math.tan(v1);
                            entrada.setText(tan + " ");
                            break;

                        case "-1tan":
                            v1 = Double.parseDouble(entrada.getText());
                            salida.setText(" -1tanR( " + v1 + " )");
                            atan = Math.atan(v1);
                            entrada.setText(atan + " ");
                    }
                }

            }
        }
        //MÉTODO Operaciones
        public void operaciones ( double v1, double v2){
            switch (tpoperacion) {
                case "+":
                    resultado = v1 + v2;
                    entrada.setText(resultado + "");
                    v1 = Double.parseDouble(entrada.getText());
                    break;
                case "-":
                    resultado = v1 - v2;
                    entrada.setText(resultado + "");
                    v1 = Double.parseDouble(entrada.getText());
                    break;
                case "*":
                    resultado = v1 * v2;
                    entrada.setText(resultado + "");
                    v1 = Double.parseDouble(entrada.getText());
                    break;
                case "/":
                    if (v2 == 0) {
                        entrada.setText("Error");
                        break;
                    } else {
                        resultado = v1 / v2;
                        entrada.setText(resultado + "");
                        v1 = Double.parseDouble(entrada.getText());
                        break;
                    }
                    //POTENCIA
                case "p":

                    resultado = Math.pow(v1, v2);
                    entrada.setText(resultado + " ");
                    break;



            }

        }

    public static void main(String[] args) {


        Calculadora calculadora = new Calculadora();
    }
}

