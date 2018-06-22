package view;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import classes.AluguelDeCarro;
import listas.Armazenador;
import classes.BabySitter;
import classes.Cliente;
import classes.ConteudoExclusivo;
import classes.Contrato;
import classes.Dados;
import classes.Massagem;
import classes.PlayGround;
import classes.Quarto;
import classes.Restaurante;
import classes.ServicoAdicional;
import classes.Transfer;

/**
 *
 * @author Bruno Henrique <bhenriquecg@gmail.com>
 * <161080391>
 */
public class TelaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastro
     */
    private Armazenador arm;
    private static ArrayList<Dados> la;
    static int valorcarro, valorbs, valormas, valorce, valortran, valorpg, valorquarto, valord;
    static double valorss, valorala;
    static String tipocarro = "";
    static int tarif, quantd;
    double taxa;
    String tarifacao;
    static int valorp, valorls, valorld, valorlt, valores, valored, valoret;
    static int contp, contls, contld, contlt, contes, conted, contet;
    static String  tipop="", tipols="", tipold="", tipolt="", tipoes="", tipoed="", tipoet="",transfer="";
    public TelaCadastro() {
        initComponents();
        arm = new Armazenador();

    }

    private void limparCampos() {
        camponome.setText("");
        campoendereco.setText("");
        campocpf.setText("");
        mas.setSelected(false);
        fem.setSelected(false);
        mes.setValue(1);
        ano.setValue(18);
        nomegravado.setText("");
        cod.setText("");
        campocartao.setText("");
        campotelefone.setText("");
        dtcheckin.setDate(null);
        dtcheckout.setDate(null);
        //campoID.setText("");
    }

    private void habilitarCampos() {

        camponome.setEditable(true);
        campocpf.setEditable(true);
        dtcheckin.setEnabled(true);
        dtcheckout.setEnabled(true);
        btbabysitter.setEnabled(true);
        btadc.setEnabled(true);
        campocartao.setEditable(true);
        nomegravado.setEnabled(true);
        cod.setEnabled(true);
        mes.setEnabled(true);
        ano.setEnabled(true);
        nomegravado.setEditable(true);
        cod.setEditable(true);
        campoendereco.setEditable(true);
        btmassagem.setEnabled(true);
        btrestaurante.setEnabled(true);
        btce.setEnabled(true);
        btpg.setEnabled(true);
        quartos.setEnabled(true);
        //btcadastro.setEnabled(true);
        fem.setEnabled(true);
        mas.setEnabled(true);
        campotelefone.setEditable(true);
    }

    private void vercontratos() {
        btcontratosfechados.setEnabled(true);
        bttodoscontratos.setEnabled(true);
        btfecharcontrato.setEnabled(true);
    }

    private void desabilitarCampos() {
        camponome.setEditable(false);
        campocpf.setEditable(false);
        dtcheckin.setEnabled(false);
        dtcheckout.setEnabled(false);
        btbabysitter.setEnabled(false);
        btadc.setEnabled(false);
        campocartao.setEditable(false);
        nomegravado.setEnabled(false);
        nomegravado.setEditable(false);
        cod.setEditable(false);
        cod.setEnabled(false);
        mes.setEnabled(false);
        ano.setEnabled(false);
        campoendereco.setEditable(false);
        btmassagem.setEnabled(false);
        btrestaurante.setEnabled(false);
        btce.setEnabled(false);
        btpg.setEnabled(false);
        quartos.setEnabled(false);
        //btcadastro.setEnabled(false);
        fem.setEnabled(false);
        mas.setEnabled(false);
        campotelefone.setEditable(false);
        ma.setEnabled(false);
        fe.setEnabled(false);
    }

    public void Aluguel(AluguelDeCarro alc) {
        this.valorcarro = alc.getValor();
        this.tipocarro = alc.getCarro();

    }

    public void BabySitter(BabySitter bs) {
        this.valorbs = bs.getValorbaba();

    }

    public void Massagem(Massagem mas) {
        this.valormas = mas.getValormas();

    }

    public void ConteudoExclusivo(ConteudoExclusivo ce) {
        this.valorce = ce.getValorce();

    }

    public void Restaurante(Restaurante res) {
        this.valord = res.getDrink().getValorBebida();
        this.valorala = res.getLaCarte().getValorRefeicao();
        this.valorss = res.getSelfService().getValorService();

    }

    public void PlayGround(PlayGround pg) {
        this.valorpg = pg.getValorpg();

    }

    public void Transfer(Transfer tran) {
        this.valortran = tran.getValor();
        this.transfer = tran.getTransfer();

    }

    public void Quarto(Quarto q) {
        this.valorp = q.getP().getValorp();
        this.valorls = q.getLs().getValorls();
        this.valorld = q.getLd().getValorld();
        this.valorlt = q.getLt().getValorlt();
        this.valores = q.getEs().getValores();
        this.valored = q.getEd().getValored();
        this.valoret = q.getEt().getValoret();
        this.tipop = q.getP().getQuartoz();
        this.tipols = q.getLs().getQuartoz();
        this.tipold = q.getLd().getQuartoz();
        this.tipolt = q.getLt().getQuartoz();
        this.tipoes = q.getEs().getQuartoz();
        this.tipoed = q.getEd().getQuartoz();
        this.tipoet = q.getEt().getQuartoz();
    }

    public void Cliente(Cliente c) {
        this.contp = c.getContp();
        this.contls = c.getContls();
        this.contld = c.getContlt();
        this.contlt = c.getContlt();
        this.contes = c.getContes();
        this.conted = c.getConted();
        this.contet = c.getContet();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexo = new javax.swing.ButtonGroup();
        btcadastro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        camponome = new javax.swing.JTextField();
        campoendereco = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        campocpf = new javax.swing.JFormattedTextField();
        campocartao = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        btbabysitter = new javax.swing.JButton();
        btadc = new javax.swing.JButton();
        btmassagem = new javax.swing.JButton();
        btce = new javax.swing.JButton();
        bttransfer = new javax.swing.JButton();
        btpg = new javax.swing.JButton();
        btrestaurante = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelacadastro = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        dtcheckin = new com.toedter.calendar.JDateChooser();
        dtcheckout = new com.toedter.calendar.JDateChooser();
        dataerrada = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        ma = new javax.swing.JButton();
        fe = new javax.swing.JButton();
        mas = new javax.swing.JRadioButton();
        fem = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        campotelefone = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btfecharcontrato = new javax.swing.JButton();
        btcontratosfechados = new javax.swing.JButton();
        bttodoscontratos = new javax.swing.JButton();
        btnovocontrato = new javax.swing.JButton();
        bteditar = new javax.swing.JButton();
        btvercontratos = new javax.swing.JButton();
        campopesquisa = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        quartos = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        removerp = new javax.swing.JButton();
        removerld = new javax.swing.JButton();
        removerls = new javax.swing.JButton();
        removeres = new javax.swing.JButton();
        removeret = new javax.swing.JButton();
        removered = new javax.swing.JButton();
        removerlt = new javax.swing.JButton();
        btremoveralacarte = new javax.swing.JButton();
        btremoverbebidas = new javax.swing.JButton();
        btremoveradc = new javax.swing.JButton();
        btremoverbs = new javax.swing.JButton();
        btremoverpg = new javax.swing.JButton();
        btremoverss = new javax.swing.JButton();
        btremovermas = new javax.swing.JButton();
        btremoverce = new javax.swing.JButton();
        master = new javax.swing.JButton();
        visa = new javax.swing.JButton();
        nenhum = new javax.swing.JButton();
        nomegravado = new javax.swing.JFormattedTextField();
        cod = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        american = new javax.swing.JButton();
        disners = new javax.swing.JButton();
        ano = new javax.swing.JSpinner();
        mes = new javax.swing.JSpinner();
        mesano = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro");
        setBackground(new java.awt.Color(255, 102, 0));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        btcadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cadastrar.png"))); // NOI18N
        btcadastro.setText("Realizar reserva");
        btcadastro.setBorder(null);
        btcadastro.setEnabled(false);
        btcadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcadastroActionPerformed(evt);
            }
        });
        getContentPane().add(btcadastro);
        btcadastro.setBounds(550, 630, 160, 60);

        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 50, 40, 30);

        jLabel2.setText("CPF:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(360, 50, 40, 30);

        jLabel3.setText("Nº Cartão:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 100, 60, 30);

        jLabel4.setText("Endereço:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 200, 60, 30);

        camponome.setEditable(false);
        getContentPane().add(camponome);
        camponome.setBounds(120, 50, 220, 30);

        campoendereco.setEditable(false);
        getContentPane().add(campoendereco);
        campoendereco.setBounds(120, 200, 150, 30);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setForeground(new java.awt.Color(255, 102, 51));

        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hotel Confort Premium");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(508, 508, 508)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                .addGap(95, 95, 95))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1380, 40);

        campocpf.setEditable(false);
        try {
            campocpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(campocpf);
        campocpf.setBounds(400, 50, 150, 30);

        campocartao.setEditable(false);
        try {
            campocartao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#### #### #### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campocartao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campocartaoKeyReleased(evt);
            }
        });
        getContentPane().add(campocartao);
        campocartao.setBounds(120, 100, 140, 30);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Serviços Adicionais"));

        btbabysitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baby-laughing-icon.png"))); // NOI18N
        btbabysitter.setText("Baby Sitter");
        btbabysitter.setBorder(null);
        btbabysitter.setEnabled(false);
        btbabysitter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btbabysitterStateChanged(evt);
            }
        });
        btbabysitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbabysitterActionPerformed(evt);
            }
        });

        btadc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Sportscar-car-2-icon.png"))); // NOI18N
        btadc.setText("Aluguel De Carro");
        btadc.setEnabled(false);
        btadc.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btadcStateChanged(evt);
            }
        });
        btadc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btadcActionPerformed(evt);
            }
        });

        btmassagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Oshibori-wet-hand-towel-icon.png"))); // NOI18N
        btmassagem.setText("Massagem");
        btmassagem.setEnabled(false);
        btmassagem.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btmassagemStateChanged(evt);
            }
        });
        btmassagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmassagemActionPerformed(evt);
            }
        });

        btce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Flat-TV-icon.png"))); // NOI18N
        btce.setText("Conteúdo Exclusivo");
        btce.setEnabled(false);
        btce.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btceStateChanged(evt);
            }
        });
        btce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btceActionPerformed(evt);
            }
        });

        bttransfer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bank-transfer-icon.png"))); // NOI18N
        bttransfer.setText("Transfer");
        bttransfer.setEnabled(false);
        bttransfer.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                bttransferStateChanged(evt);
            }
        });
        bttransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttransferActionPerformed(evt);
            }
        });

        btpg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/City-Playground-icon.png"))); // NOI18N
        btpg.setText("Play Ground");
        btpg.setEnabled(false);
        btpg.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btpgStateChanged(evt);
            }
        });
        btpg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpgActionPerformed(evt);
            }
        });

        btrestaurante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Restaurant-icon.png"))); // NOI18N
        btrestaurante.setText("Restaurante");
        btrestaurante.setEnabled(false);
        btrestaurante.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btrestauranteStateChanged(evt);
            }
        });
        btrestaurante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btrestauranteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btbabysitter, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btadc, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bttransfer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btce, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btpg, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btmassagem, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(btrestaurante)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btbabysitter)
                    .addComponent(btadc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btrestaurante, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btce, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btpg, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmassagem, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 330, 540, 170);

        tabelacadastro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Status", "Nome", "CPF", "CheckIn", "CheckOut", "Quartos", "Aluguel De Carro", "Baby Sitter", "Conteúdo Exclusivo", "Transfer", "Massagem", "Play Ground", "Restaurante", "Valor Total", "Tarifação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelacadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelacadastroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelacadastro);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 500, 1360, 110);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Data"));

        jLabel10.setText("CheckIn:");

        jLabel11.setText("CheckOut:");

        dtcheckin.setEnabled(false);
        dtcheckin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dtcheckinKeyReleased(evt);
            }
        });

        dtcheckout.setEnabled(false);
        dtcheckout.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dtcheckoutKeyReleased(evt);
            }
        });

        dataerrada.setEditable(false);
        dataerrada.setBorder(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dtcheckin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dtcheckout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(dataerrada, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dtcheckin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtcheckout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dataerrada, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(20, 240, 400, 90);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));

        ma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User-Administrator-Blue-icon.png"))); // NOI18N
        ma.setEnabled(false);

        fe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon girl.png"))); // NOI18N
        fe.setEnabled(false);

        sexo.add(mas);
        mas.setText("Masculino");
        mas.setEnabled(false);
        mas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                masStateChanged(evt);
            }
        });

        sexo.add(fem);
        fem.setText("Feminino");
        fem.setEnabled(false);
        fem.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                femStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mas)
                    .addComponent(fem))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fe, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ma, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mas)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fe, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(fem)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(580, 50, 180, 130);

        jLabel12.setText("Telefone:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(340, 210, 60, 14);

        campotelefone.setEditable(false);
        try {
            campotelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(campotelefone);
        campotelefone.setBounds(400, 200, 120, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/voltar1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 40, 50, 50);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Opções"));

        btfecharcontrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fecharcontrato.png"))); // NOI18N
        btfecharcontrato.setText("Fechar Contrato");
        btfecharcontrato.setEnabled(false);
        btfecharcontrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btfecharcontratoActionPerformed(evt);
            }
        });

        btcontratosfechados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/contratosfechados.png"))); // NOI18N
        btcontratosfechados.setText("Contratos Fechados");
        btcontratosfechados.setEnabled(false);
        btcontratosfechados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcontratosfechadosActionPerformed(evt);
            }
        });

        bttodoscontratos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/todoscontratos.png"))); // NOI18N
        bttodoscontratos.setText("Todos os Contratos");
        bttodoscontratos.setEnabled(false);
        bttodoscontratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttodoscontratosActionPerformed(evt);
            }
        });

        btnovocontrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/todososcontratos.png"))); // NOI18N
        btnovocontrato.setText("Novo Contrato");
        btnovocontrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnovocontratoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnovocontrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btcontratosfechados, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(bttodoscontratos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btfecharcontrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(btnovocontrato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btcontratosfechados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bttodoscontratos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btfecharcontrato)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(770, 40, 230, 260);

        bteditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/salvar.png"))); // NOI18N
        bteditar.setText("Salvar Alterações");
        bteditar.setEnabled(false);
        bteditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteditarActionPerformed(evt);
            }
        });
        getContentPane().add(bteditar);
        bteditar.setBounds(730, 630, 170, 60);

        btvercontratos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lupa32.png"))); // NOI18N
        btvercontratos.setText("Ver Contrato");
        btvercontratos.setEnabled(false);
        btvercontratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btvercontratosActionPerformed(evt);
            }
        });
        getContentPane().add(btvercontratos);
        btvercontratos.setBounds(150, 640, 160, 30);

        try {
            campopesquisa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campopesquisa.setEnabled(false);
        getContentPane().add(campopesquisa);
        campopesquisa.setBounds(10, 640, 130, 30);

        jLabel13.setText("CPF:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 620, 40, 14);

        quartos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/quartos.png"))); // NOI18N
        quartos.setText("Quartos");
        quartos.setEnabled(false);
        quartos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                quartosStateChanged(evt);
            }
        });
        quartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quartosActionPerformed(evt);
            }
        });
        getContentPane().add(quartos);
        quartos.setBounds(420, 260, 120, 41);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Remover"));

        removerp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/q4.png"))); // NOI18N
        removerp.setText("Presidencial");
        removerp.setEnabled(false);
        removerp.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                removerpStateChanged(evt);
            }
        });
        removerp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerpActionPerformed(evt);
            }
        });

        removerld.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/q3.png"))); // NOI18N
        removerld.setText("Luxo Duplo");
        removerld.setEnabled(false);
        removerld.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                removerldStateChanged(evt);
            }
        });
        removerld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerldActionPerformed(evt);
            }
        });

        removerls.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/q1.png"))); // NOI18N
        removerls.setText("Luxo Simples");
        removerls.setEnabled(false);
        removerls.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                removerlsStateChanged(evt);
            }
        });
        removerls.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerlsActionPerformed(evt);
            }
        });

        removeres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/q5.png"))); // NOI18N
        removeres.setText("Executivo Simples");
        removeres.setEnabled(false);
        removeres.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                removeresStateChanged(evt);
            }
        });
        removeres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeresActionPerformed(evt);
            }
        });

        removeret.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/q7.png"))); // NOI18N
        removeret.setText("Executivo Triplo");
        removeret.setEnabled(false);
        removeret.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                removeretStateChanged(evt);
            }
        });
        removeret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeretActionPerformed(evt);
            }
        });

        removered.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/q6.png"))); // NOI18N
        removered.setText("Exexutivo Duplo");
        removered.setEnabled(false);
        removered.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                removeredStateChanged(evt);
            }
        });
        removered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeredActionPerformed(evt);
            }
        });

        removerlt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/q2.png"))); // NOI18N
        removerlt.setText("Luxo Triplo");
        removerlt.setEnabled(false);
        removerlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerltActionPerformed(evt);
            }
        });

        btremoveralacarte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/removerres.png"))); // NOI18N
        btremoveralacarte.setText("À LA CARTE");
        btremoveralacarte.setEnabled(false);
        btremoveralacarte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btremoveralacarteActionPerformed(evt);
            }
        });

        btremoverbebidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ss.png"))); // NOI18N
        btremoverbebidas.setText("Bebidas");
        btremoverbebidas.setEnabled(false);
        btremoverbebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btremoverbebidasActionPerformed(evt);
            }
        });

        btremoveradc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/removercarro.png"))); // NOI18N
        btremoveradc.setText("Aluguel De Carro");
        btremoveradc.setEnabled(false);
        btremoveradc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btremoveradcActionPerformed(evt);
            }
        });

        btremoverbs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/babamenina.png"))); // NOI18N
        btremoverbs.setText(" Baby Sitter");
        btremoverbs.setEnabled(false);
        btremoverbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btremoverbsActionPerformed(evt);
            }
        });

        btremoverpg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/removerpg.png"))); // NOI18N
        btremoverpg.setText("PlayGround");
        btremoverpg.setEnabled(false);
        btremoverpg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btremoverpgActionPerformed(evt);
            }
        });

        btremoverss.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/removerss.png"))); // NOI18N
        btremoverss.setText("Self-Service");
        btremoverss.setEnabled(false);
        btremoverss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btremoverssActionPerformed(evt);
            }
        });

        btremovermas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/removermassagem.png"))); // NOI18N
        btremovermas.setText("Massagem");
        btremovermas.setEnabled(false);
        btremovermas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btremovermasActionPerformed(evt);
            }
        });

        btremoverce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/removerce.png"))); // NOI18N
        btremoverce.setText("Conteúdo Exclusivo");
        btremoverce.setEnabled(false);
        btremoverce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btremoverceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(removerp, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(removerld)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removerlt)
                        .addGap(18, 18, 18)
                        .addComponent(btremoverbs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btremoverce))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(removerls)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removeres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btremoveradc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btremovermas, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btremoverpg))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(removeret)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removered, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btremoveralacarte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btremoverbebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btremoverss)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btremoverbs, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(removerp, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(removerld, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(removerlt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btremoverce, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btremoverbebidas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(removeret, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(removered, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btremoveralacarte, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btremoverss, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btremovermas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(removerls, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(removeres, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btremoveradc, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btremoverpg, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel7);
        jPanel7.setBounds(570, 300, 790, 190);

        master.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/master_card.png"))); // NOI18N
        master.setToolTipText("MasterCard");
        master.setEnabled(false);
        getContentPane().add(master);
        master.setBounds(280, 110, 30, 20);

        visa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visa.png"))); // NOI18N
        visa.setToolTipText("Visa");
        visa.setEnabled(false);
        getContentPane().add(visa);
        visa.setBounds(320, 110, 30, 20);

        nenhum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cartao24.png"))); // NOI18N
        nenhum.setToolTipText("Cartão Inválido");
        nenhum.setEnabled(false);
        getContentPane().add(nenhum);
        nenhum.setBounds(440, 110, 20, 20);

        nomegravado.setEditable(false);
        getContentPane().add(nomegravado);
        nomegravado.setBounds(120, 160, 180, 30);

        cod.setEditable(false);
        try {
            cod.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(cod);
        cod.setBounds(310, 160, 50, 30);

        jLabel6.setText("Nome(Como gravado no cartão)");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 140, 240, 14);

        jLabel7.setText("Cod.");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(310, 140, 30, 14);

        jLabel8.setText("Validade");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(380, 140, 40, 14);

        american.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/american_express.png"))); // NOI18N
        american.setToolTipText("American Express");
        american.setEnabled(false);
        getContentPane().add(american);
        american.setBounds(360, 110, 30, 20);

        disners.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Diners 32.png"))); // NOI18N
        disners.setToolTipText("Disners Club");
        disners.setEnabled(false);
        getContentPane().add(disners);
        disners.setBounds(400, 110, 30, 20);

        ano.setModel(new javax.swing.SpinnerNumberModel(18, 18, null, 1));
        ano.setEnabled(false);
        ano.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                anoStateChanged(evt);
            }
        });
        getContentPane().add(ano);
        ano.setBounds(440, 160, 50, 30);

        mes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        mes.setEnabled(false);
        mes.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                mesStateChanged(evt);
            }
        });
        getContentPane().add(mes);
        mes.setBounds(379, 160, 50, 30);

        mesano.setEditable(false);
        mesano.setBorder(null);
        mesano.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        mesano.setSelectedTextColor(new java.awt.Color(240, 240, 240));
        getContentPane().add(mesano);
        mesano.setBounds(500, 170, 80, 14);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btbabysitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbabysitterActionPerformed
        new TelaAddBabySitter().setVisible(true);
    }//GEN-LAST:event_btbabysitterActionPerformed

    private void btadcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btadcActionPerformed
        new TelaAddAluguelDeCarro().setVisible(true);
    }//GEN-LAST:event_btadcActionPerformed

    private void btmassagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmassagemActionPerformed
        new TelaAddMassagem().setVisible(true);
    }//GEN-LAST:event_btmassagemActionPerformed

    private void btceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btceActionPerformed
        new TelaAddConteudoExclusivo().setVisible(true);
    }//GEN-LAST:event_btceActionPerformed

    private void bttransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttransferActionPerformed
        new TelaTransfer().setVisible(true);
    }//GEN-LAST:event_bttransferActionPerformed

    private void btpgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpgActionPerformed
        new TelaAddPlayGround().setVisible(true);
    }//GEN-LAST:event_btpgActionPerformed

    private void btcadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcadastroActionPerformed
        Cliente cliente = new Cliente();
        Quarto quarto = new Quarto();
        Contrato contrato = new Contrato(cliente);
        ServicoAdicional s1 = new ServicoAdicional();
        Dados d1 = new Dados(contrato, quarto, s1);
        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");

        String nome = camponome.getText();
        String cpf = campocpf.getText();
        String end = campoendereco.getText();
        String cartao = campocartao.getText();
        String data1 = formatar.format(dtcheckin.getDate());//formata checkin para dd/MM/yyyy
        String data2 = formatar.format(dtcheckout.getDate());//formata checkout para dd/MM/yyyy
        String codigo = cod.getText();
        int mess = (int) mes.getValue();
        int anoo = (int) ano.getValue();
        String nomecartao = nomegravado.getText();
        Date in = dtcheckin.getDate();
        Date out = dtcheckout.getDate();
        char sexo = 'F';
        if (mas.isSelected()) {
            sexo = 'M';
        }
        String tel = campotelefone.getText();
        quantd = (int) ((out.getTime() - in.getTime()) / 86400000L);//calcula a quantidade de dias do hospede no hotel
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setEndereco(end);
        cliente.setCartao(cartao);
        cliente.setCheckin(in);
        cliente.setCheckout(out);
        cliente.setSexo(sexo);
        cliente.setTel(tel);
        cliente.setCodigo(codigo);
        cliente.setMes(mess);
        cliente.setAno(anoo);
        cliente.setData1(data1);
        cliente.setData2(data2);
        cliente.setNomecartao(nomecartao);
        cliente.setDias(quantd);
        cliente.setStatus("Aberto");
        cliente.setContp(contp);
        cliente.setContls(contls);
        cliente.setContld(contld);
        cliente.setContlt(contlt);
        cliente.setContes(contes);
        cliente.setConted(conted);
        cliente.setContet(contet);

        //quantd = (int) ((out.getTime() - in.getTime()) / 86400000L);
        tarif = in.getMonth();
        taxa = 1;
        tarifacao = "Simples";
        if (tarif == 0) {
            tarifacao = "Início de ano";// verifica os meses de alta estação
            taxa = 1.25;
        }
        if (tarif == 5) {
            tarifacao = "São João";
            taxa = 1.25;
        }
        if (tarif == 11) {
            tarifacao = "Final de ano";
            taxa = 1.25;
        }
        cliente.setTarifacao(tarifacao);
        cliente.setTaxa(taxa);

        s1.getAc().setValor(valorcarro);
        s1.getAc().setCarro(tipocarro);
        s1.getBs().setValorbaba(valorbs);
        s1.getCe().setValorce(valorce);
        s1.getMas().setValormas(valormas);
        s1.getR().getDrink().setValorBebida(valord);
        s1.getR().getLaCarte().setValorRefeicao(valorala);
        s1.getR().getSelfService().setValor(valorss);
        s1.getTrans().setValor(valortran);
        s1.getPg().setValorpg(valorpg);

        quarto.getP().setValorp(valorp);
        quarto.getLs().setValorls(valorls);
        quarto.getLd().setValorld(valorld);
        quarto.getLt().setValorlt(valorlt);
        quarto.getEs().setValores(valores);
        quarto.getEd().setValored(valored);
        quarto.getEt().setValoret(valoret);
        quarto.getP().setQuartoz(tipop);
        quarto.getLs().setQuartoz(tipols);
        quarto.getLd().setQuartoz(tipold);
        quarto.getLt().setQuartoz(tipolt);
        quarto.getEs().setQuartoz(tipoes);
        quarto.getEd().setQuartoz(tipoed);
        quarto.getEt().setQuartoz(tipoet);
        
        //quarto.setTipo(quartoq);
        //quarto.setValortotal(valorquarto);

        boolean b = arm.addCliente(d1);
        arm.addClienteTodos(d1);

        limparCampos();
        JOptionPane.showMessageDialog(this, b ? "Salvo" : "nao salvo", "Salvo", JOptionPane.INFORMATION_MESSAGE);
        preencherTabela();
        //quartoq = "";
        valorcarro = 0;
        valorbs = 0;
        valorce = 0;
        valorpg = 0;
        valormas = 0;
        valorss = 0;
        valord = 0;
        valorala = 0;
        valortran = 0;
        tipocarro = "";
        valorp = 0;
        valorls = 0;
        valorld = 0;
        valorlt = 0;
        valores = 0;
        valored = 0;
        valoret = 0;
        tipop=""; tipols=""; tipold="";tipolt=""; tipoes=""; tipoed=""; tipoet="";
        btvercontratos.setEnabled(true);
        campopesquisa.setEditable(true);
        campopesquisa.setEnabled(true);
        btcadastro.setEnabled(false);
        master.setEnabled(false);
        visa.setEnabled(false);
        disners.setEnabled(false);
        american.setEnabled(false);
        nenhum.setEnabled(false);
        vercontratos();
        desabilitarCampos();
    }//GEN-LAST:event_btcadastroActionPerformed

    private void masStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_masStateChanged
        // TODO add your handling code here:
        if (mas.isSelected()) {
            ma.setEnabled(true);
        } else {
            ma.setEnabled(false);
        }
    }//GEN-LAST:event_masStateChanged

    private void femStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_femStateChanged
        // TODO add your handling code here:
        if (fem.isSelected()) {
            fe.setEnabled(true);
        } else {
            fe.setEnabled(false);
        }
    }//GEN-LAST:event_femStateChanged

    private void btrestauranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrestauranteActionPerformed
        new TelaEscolhaRestaurante().setVisible(true);
    }//GEN-LAST:event_btrestauranteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new TelaInicial().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btfecharcontratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btfecharcontratoActionPerformed
        int j = tabelacadastro.getSelectedRow();
        btnovocontrato.setEnabled(true);
        if (j != -1) {// remove dos abertos o contrato que deseja chegar e adiciona ele nos fechados
            new TelaQuandoFecharContrato(j, arm.getAberto()).setVisible(true);
            String x = (String) tabelacadastro.getValueAt(j, 2).toString();
            for (int p = 0; p < la.size(); p++) {
                Dados sa = la.get(p);
                if (x.equals(sa.getContrato().getCliente().getCpf())) {
                    //fechados.add(sa);
                    TelaAddQuarto.g += arm.getAberto().get(j).getContrato().getCliente().getContp();
                    TelaAddQuarto.a += arm.getAberto().get(j).getContrato().getCliente().getContls();
                    TelaAddQuarto.b += arm.getAberto().get(j).getContrato().getCliente().getContld();
                    TelaAddQuarto.c += arm.getAberto().get(j).getContrato().getCliente().getContlt();
                    TelaAddQuarto.d += arm.getAberto().get(j).getContrato().getCliente().getContes();
                    TelaAddQuarto.e += arm.getAberto().get(j).getContrato().getCliente().getConted();
                    TelaAddQuarto.f += arm.getAberto().get(j).getContrato().getCliente().getContet();

                    arm.getAberto().get(j).getContrato().getCliente().setStatus("Fechado");
                    arm.getFechado().add(sa);
                    arm.getAberto().remove(sa);
                    la.remove(sa);
                    ((DefaultTableModel) tabelacadastro.getModel()).removeRow(tabelacadastro.getSelectedRow());
                    break;
                }
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione o contrato que deseja fechar");
        }
        desabilitarCampos();
        bttransfer.setEnabled(false);
        bteditar.setEnabled(false);
        limparCampos();
        DesabilitarTudo();
        btvercontratos.setEnabled(true);
        campopesquisa.setEditable(true);
        campopesquisa.setEnabled(true);
    }//GEN-LAST:event_btfecharcontratoActionPerformed

    private void btcontratosfechadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcontratosfechadosActionPerformed
        if (arm.getFechado().size() > 0) {//Ver contratos fechados
            new TelaVerContratosFechados(arm.getFechado()).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Sem contratos fechados por enquanto");
        }
    }//GEN-LAST:event_btcontratosfechadosActionPerformed

    private void bttodoscontratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttodoscontratosActionPerformed
        new TelaVerTodosContratos(arm.getServico()).setVisible(true);//ver todos os contratos
    }//GEN-LAST:event_bttodoscontratosActionPerformed

    private void tabelacadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelacadastroMouseClicked

        int linha = tabelacadastro.getSelectedRow();

        if (linha != -1) {
            habilitarCampos();
            btvercontratos.setEnabled(false);
            campopesquisa.setEditable(false);
            bttransfer.setEnabled(true);
            bteditar.setEnabled(true);
            btnovocontrato.setEnabled(false);
            if (arm.getAberto().get(linha).getServicoadd().getAc().getValor() != 0) {//Habilita os botões de remover se o valor for diferente de zerp
                btremoveradc.setEnabled(true);
            } else {
                btremoveradc.setEnabled(false);
            }
            if (arm.getAberto().get(linha).getServicoadd().getBs().getValorbaba() != 0) {
                btremoverbs.setEnabled(true);
            } else {
                btremoverbs.setEnabled(false);
            }
            if (arm.getAberto().get(linha).getServicoadd().getCe().getValorce() != 0) {
                btremoverce.setEnabled(true);
            } else {
                btremoverce.setEnabled(false);
            }
            if (arm.getAberto().get(linha).getServicoadd().getMas().getValormas() != 0) {
                btremovermas.setEnabled(true);
            } else {
                btremovermas.setEnabled(false);
            }
            if (arm.getAberto().get(linha).getServicoadd().getPg().getValorpg() != 0) {
                btremoverpg.setEnabled(true);
            } else {
                btremoverpg.setEnabled(false);
            }
            if (arm.getAberto().get(linha).getServicoadd().getR().getLaCarte().getValorRefeicao() != 0) {
                btremoveralacarte.setEnabled(true);
            } else {
                btremoveralacarte.setEnabled(false);
            }
            if (arm.getAberto().get(linha).getServicoadd().getR().getSelfService().getValorService() != 0) {
                btremoverss.setEnabled(true);
            } else {
                btremoverss.setEnabled(false);
            }
            if (arm.getAberto().get(linha).getServicoadd().getR().getDrink().getValorBebida() != 0) {
                btremoverbebidas.setEnabled(true);
            } else {
                btremoverbebidas.setEnabled(false);
            }
            if (arm.getAberto().get(linha).getQuarto().getP().getValorp() != 0) {
                removerp.setEnabled(true);
            } else {
                removerp.setEnabled(false);
            }
            if (arm.getAberto().get(linha).getQuarto().getLs().getValorls() != 0) {
                removerls.setEnabled(true);
            } else {
                removerls.setEnabled(false);
            }
            if (arm.getAberto().get(linha).getQuarto().getLd().getValorld() != 0) {
                removerld.setEnabled(true);
            } else {
                removerld.setEnabled(false);
            }
            if (arm.getAberto().get(linha).getQuarto().getLt().getValorlt() != 0) {
                removerlt.setEnabled(true);
            } else {
                removerlt.setEnabled(false);
            }
            if (arm.getAberto().get(linha).getQuarto().getEs().getValores() != 0) {
                removeres.setEnabled(true);
            } else {
                removeres.setEnabled(false);
            }
            if (arm.getAberto().get(linha).getQuarto().getEd().getValored() != 0) {
                removered.setEnabled(true);
            } else {
                removered.setEnabled(false);
            }
            if (arm.getAberto().get(linha).getQuarto().getEt().getValoret() != 0) {
                removeret.setEnabled(true);
            } else {
                removeret.setEnabled(false);
            }
            camponome.setText(tabelacadastro.getValueAt(linha, 1).toString());
            campocpf.setText(tabelacadastro.getValueAt(linha, 2).toString());
            campocartao.setText(arm.getServico().get(linha).getContrato().getCliente().getCartao());
            campoendereco.setText(arm.getServico().get(linha).getContrato().getCliente().getEndereco());// seta nos campos os valores de acordo com os valores dos contratos
            campotelefone.setText(arm.getServico().get(linha).getContrato().getCliente().getTel());
            dtcheckin.setDate(arm.getServico().get(linha).getContrato().getCliente().getCheckin());
            dtcheckout.setDate(arm.getServico().get(linha).getContrato().getCliente().getCheckout());
            mes.setValue(arm.getServico().get(linha).getContrato().getCliente().getMes());
            ano.setValue(arm.getServico().get(linha).getContrato().getCliente().getAno());
            cod.setText(arm.getServico().get(linha).getContrato().getCliente().getCodigo());
            nomegravado.setText(arm.getServico().get(linha).getContrato().getCliente().getNomecartao());

            if (arm.getAberto().get(linha).getContrato().getCliente().getSexo() == 'F') {
                fem.setSelected(true);
            } else {
                mas.setSelected(true);
            }
        }
    }//GEN-LAST:event_tabelacadastroMouseClicked

    private void bteditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditarActionPerformed
        btvercontratos.setEnabled(true);
        campopesquisa.setEditable(true);
        campopesquisa.setEnabled(true);
        habilitarCampos();
        int j = tabelacadastro.getSelectedRow();

        String nome = camponome.getText();
        String cpf = campocpf.getText();
        String end = campoendereco.getText();
        String cartao = campocartao.getText();
        Date in = dtcheckin.getDate();
        Date out = dtcheckout.getDate();
        String codigo = cod.getText();
        int mess = (int) mes.getValue();
        int anoo = (int) ano.getValue();
        String nomecartao = nomegravado.getText();

        SimpleDateFormat formatar1 = new SimpleDateFormat("dd/MM/yyyy");
        String entrada = formatar1.format(dtcheckin.getDate());//formata a data checkin para dd/MM/yyyy
        String saida = formatar1.format(dtcheckout.getDate());//formata a data checkout para dd/MM/yyyy
        quantd = (int) ((out.getTime() - in.getTime()) / 86400000L);//Pega a data do checkout menos checkin, o resultato é a quantidade de dias que o cliente passou no hotel
        char sexo = 'F';
        if (mas.isSelected()) {
            sexo = 'M';
        }
        String tel = campotelefone.getText();
        tarif = in.getMonth();
        tarifacao = "Simples";
        taxa = 1;
        if (tarif == 0) {
            tarifacao = "Início de ano";// Tarifação se o mes for janeiro, a tatifação recebe inicio de ano
            taxa = 1.25;
        }
        if (tarif == 5) {
            tarifacao = "São João";
            taxa = 1.25;
        }
        if (tarif == 11) {
            tarifacao = "Final de ano";
            taxa = 1.25;
        }

        arm.getAberto().get(j).getServicoadd().getAc().setValor(arm.getAberto().get(j).getServicoadd().getAc().getValor() + valorcarro);//Editando o valor do carro(Soma com o valor existente)
        arm.getAberto().get(j).getServicoadd().getAc().setCarro(arm.getAberto().get(j).getServicoadd().getAc().getCarro() + ("\n" + tipocarro));

        arm.getAberto().get(j).getServicoadd().getBs().setValorbaba(arm.getAberto().get(j).getServicoadd().getBs().getValorbaba() + valorbs);

        arm.getAberto().get(j).getServicoadd().getMas().setValormas(arm.getAberto().get(j).getServicoadd().getMas().getValormas() + valormas);

        arm.getAberto().get(j).getServicoadd().getPg().setValorpg(arm.getAberto().get(j).getServicoadd().getPg().getValorpg() + valorpg);

        arm.getAberto().get(j).getServicoadd().getCe().setValorce(arm.getAberto().get(j).getServicoadd().getCe().getValorce() + valorce);

        arm.getAberto().get(j).getServicoadd().getTrans().setValor(arm.getAberto().get(j).getServicoadd().getTrans().getValor() + valortran);
        arm.getAberto().get(j).getServicoadd().getTrans().setTransfer(arm.getAberto().get(j).getServicoadd().getTrans().getTransfer() + transfer);
        //arm.getAberto().get(j).getQuarto().setValortotal(arm.getAberto().get(j).getQuarto().getValortotal() + valorquarto);
        //arm.getAberto().get(j).getQuarto().setTipo(arm.getAberto().get(j).getQuarto().getTipo() + quartoq);

        arm.getAberto().get(j).getServicoadd().getR().getDrink().setValorBebida(arm.getAberto().get(j).getServicoadd().getR().getDrink().getValorBebida() + valord);
        arm.getAberto().get(j).getServicoadd().getR().getLaCarte().setValorRefeicao(arm.getAberto().get(j).getServicoadd().getR().getLaCarte().getValorRefeicao() + valorala);
        arm.getAberto().get(j).getServicoadd().getR().getSelfService().setValor(arm.getAberto().get(j).getServicoadd().getR().getSelfService().getValorService() + valorss);

        arm.getAberto().get(j).getQuarto().getP().setValorp(arm.getAberto().get(j).getQuarto().getP().getValorp() + valorp);
        arm.getAberto().get(j).getQuarto().getLs().setValorls(arm.getAberto().get(j).getQuarto().getLs().getValorls() + valorls);
        arm.getAberto().get(j).getQuarto().getLd().setValorld(arm.getAberto().get(j).getQuarto().getLd().getValorld() + valorld);
        arm.getAberto().get(j).getQuarto().getLt().setValorlt(arm.getAberto().get(j).getQuarto().getLt().getValorlt() + valorlt);
        arm.getAberto().get(j).getQuarto().getEs().setValores(arm.getAberto().get(j).getQuarto().getEs().getValores() + valores);
        arm.getAberto().get(j).getQuarto().getEd().setValored(arm.getAberto().get(j).getQuarto().getEd().getValored() + valores);
        arm.getAberto().get(j).getQuarto().getEt().setValoret(arm.getAberto().get(j).getQuarto().getEt().getValoret() + valoret);

        arm.getAberto().get(j).getQuarto().getP().setQuartoz(arm.getAberto().get(j).getQuarto().getP().getQuartoz() + tipop);
        arm.getAberto().get(j).getQuarto().getLs().setQuartoz(arm.getAberto().get(j).getQuarto().getLs().getQuartoz() + tipols);
        arm.getAberto().get(j).getQuarto().getLd().setQuartoz(arm.getAberto().get(j).getQuarto().getLd().getQuartoz() + tipold);
        arm.getAberto().get(j).getQuarto().getLt().setQuartoz(arm.getAberto().get(j).getQuarto().getLt().getQuartoz() + tipolt);
        arm.getAberto().get(j).getQuarto().getEs().setQuartoz(arm.getAberto().get(j).getQuarto().getEs().getQuartoz() + tipoes);
        arm.getAberto().get(j).getQuarto().getEd().setQuartoz(arm.getAberto().get(j).getQuarto().getEd().getQuartoz() + tipoes);
        arm.getAberto().get(j).getQuarto().getEt().setQuartoz(arm.getAberto().get(j).getQuarto().getEt().getQuartoz() + tipoet);

        
        arm.EditarContratos(j, nome, sexo, cpf, cartao, end, entrada, saida, in, out, tel, tarifacao, taxa, quantd, codigo, mess, anoo, nomecartao);

        preencherTabela();
        valorcarro = 0;
        valorbs = 0;
        valorce = 0;//zera todos os valor de serviços adicionais e quartos
        valormas = 0;
        valorpg = 0;
        valorss = 0;
        valord = 0;
        valorala = 0;
        valortran = 0;
        tipocarro = "";
        valorp = 0;
        valorls = 0;
        valorld = 0;
        valorlt = 0;
        valores = 0;
        valored = 0;tipop=""; tipols=""; tipold="";tipolt=""; tipoes=""; tipoed=""; tipoet="";transfer="";
        valoret = 0;
        master.setEnabled(false);
        visa.setEnabled(false);
        disners.setEnabled(false);
        american.setEnabled(false);
        nenhum.setEnabled(false);
        limparCampos();
        desabilitarCampos();
        DesabilitarTudo();
    }//GEN-LAST:event_bteditarActionPerformed
    private void DesabilitarTudo() {//desabilita os campos
        btnovocontrato.setEnabled(true);
        bteditar.setEnabled(false);
        removerp.setEnabled(false);
        removerls.setEnabled(false);
        removerld.setEnabled(false);
        removerlt.setEnabled(false);
        removeres.setEnabled(false);
        removered.setEnabled(false);
        removeret.setEnabled(false);
        bttransfer.setEnabled(false);
        btremoveradc.setEnabled(false);
        btremoverbs.setEnabled(false);
        btremoverce.setEnabled(false);
        btremovermas.setEnabled(false);
        btremoverpg.setEnabled(false);
        btremoveralacarte.setEnabled(false);
        btremoverss.setEnabled(false);
        btremoverbebidas.setEnabled(false);
    }
    private void btnovocontratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnovocontratoActionPerformed
        btvercontratos.setEnabled(false);
        campopesquisa.setEditable(false);
        bteditar.setEnabled(false);
        bttransfer.setEnabled(false);
        habilitarCampos();
    }//GEN-LAST:event_btnovocontratoActionPerformed

    private void btremoveradcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btremoveradcActionPerformed
        int j = tabelacadastro.getSelectedRow();//Remover o serviço aluguel de cerro
        arm.getAberto().get(j).getServicoadd().getAc().setValor(0);
        arm.getAberto().get(j).getServicoadd().getAc().setCarro("");
        preencherTabela();
    }//GEN-LAST:event_btremoveradcActionPerformed

    private void btremoverbsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btremoverbsActionPerformed
        int j = tabelacadastro.getSelectedRow();//remover o serviço babysitter
        arm.getAberto().get(j).getServicoadd().getBs().setValorbaba(0);
        preencherTabela();
    }//GEN-LAST:event_btremoverbsActionPerformed

    private void btremoverceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btremoverceActionPerformed
        int j = tabelacadastro.getSelectedRow();//remover o serviço conteudo exclusivo
        arm.getAberto().get(j).getServicoadd().getCe().setValorce(0);
        preencherTabela();
    }//GEN-LAST:event_btremoverceActionPerformed

    private void btremovermasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btremovermasActionPerformed
        int j = tabelacadastro.getSelectedRow();//remover o serviço massagem
        arm.getAberto().get(j).getServicoadd().getMas().setValormas(0);
        preencherTabela();
    }//GEN-LAST:event_btremovermasActionPerformed

    private void btremoverpgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btremoverpgActionPerformed
        int j = tabelacadastro.getSelectedRow();//remover o serviço playground
        arm.getAberto().get(j).getServicoadd().getPg().setValorpg(0);
        preencherTabela();
    }//GEN-LAST:event_btremoverpgActionPerformed

    private void btremoveralacarteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btremoveralacarteActionPerformed
        int j = tabelacadastro.getSelectedRow();//remover o serviço a la carte
        arm.getAberto().get(j).getServicoadd().getR().getLaCarte().setValorRefeicao(0);
        preencherTabela();
    }//GEN-LAST:event_btremoveralacarteActionPerformed

    private void quartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quartosActionPerformed
        new TelaAddQuarto().setVisible(true);
    }//GEN-LAST:event_quartosActionPerformed

    private void btremoverssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btremoverssActionPerformed
        int j = tabelacadastro.getSelectedRow();//remover o serviço self service
        arm.getAberto().get(j).getServicoadd().getR().getSelfService().setValor(0);
        preencherTabela();
    }//GEN-LAST:event_btremoverssActionPerformed

    private void btremoverbebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btremoverbebidasActionPerformed
        int j = tabelacadastro.getSelectedRow();//remover o serviço bebidas
        arm.getAberto().get(j).getServicoadd().getR().getDrink().setValorBebida(0);
        preencherTabela();
    }//GEN-LAST:event_btremoverbebidasActionPerformed

    private void removerpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerpActionPerformed
        int j = tabelacadastro.getSelectedRow();//remover o quarto presidencial
        arm.getAberto().get(j).getQuarto().getP().setValorp(0);
        arm.getAberto().get(j).getQuarto().getP().setQuartoz("");
        TelaAddQuarto.g += arm.getAberto().get(j).getContrato().getCliente().getContp();//Como foi removido, aumenta a quantidade de quartos
        preencherTabela();
    }//GEN-LAST:event_removerpActionPerformed

    private void removerlsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerlsActionPerformed
        int j = tabelacadastro.getSelectedRow();//remover o quarto luxo simples
        arm.getAberto().get(j).getQuarto().getLs().setValorls(0);
        arm.getAberto().get(j).getQuarto().getLs().setQuartoz("");
        TelaAddQuarto.a += arm.getAberto().get(j).getContrato().getCliente().getContls();//Como foi removido, aumenta a quantidade de quartos
        preencherTabela();        preencherTabela();    }//GEN-LAST:event_removerlsActionPerformed

    private void removeresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeresActionPerformed
        int j = tabelacadastro.getSelectedRow();//remover o quarto executivo simples
        arm.getAberto().get(j).getQuarto().getEs().setValores(0);//zera o valor
        arm.getAberto().get(j).getQuarto().getEs().setQuartoz("");//zera o tipo
        TelaAddQuarto.d += arm.getAberto().get(j).getContrato().getCliente().getContes();//Como foi removido, aumenta a quantidade de quartos

        preencherTabela();        preencherTabela();    }//GEN-LAST:event_removeresActionPerformed

    private void removeredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeredActionPerformed
        int j = tabelacadastro.getSelectedRow();//remover o quarto  executivo duplo
        arm.getAberto().get(j).getQuarto().getEd().setValored(0);//zero o valor
        arm.getAberto().get(j).getQuarto().getEd().setQuartoz("");//zera o tipo
        TelaAddQuarto.e += arm.getAberto().get(j).getContrato().getCliente().getConted();//Como foi removido, aumenta a quantidade de quartos

        preencherTabela();        preencherTabela();    }//GEN-LAST:event_removeredActionPerformed

    private void removeretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeretActionPerformed
        int j = tabelacadastro.getSelectedRow();//remover o quarto executivo triplo
        arm.getAberto().get(j).getQuarto().getEt().setValoret(0);
        arm.getAberto().get(j).getQuarto().getEt().setQuartoz("");
        TelaAddQuarto.f += arm.getAberto().get(j).getContrato().getCliente().getContet();//Como foi removido, aumenta a quantidade de quartos
        preencherTabela();        preencherTabela();    }//GEN-LAST:event_removeretActionPerformed

    private void btvercontratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btvercontratosActionPerformed
        int j = 0, v = -1;
        if (!arm.getAberto().isEmpty()) {//Verifica se o array está vazio
            String x = campopesquisa.getText();//Se o array não estiver vazio, pega o cpf digitado
            if (!"".equals(campopesquisa.getText())) {
                for (int p = 0; p < la.size(); p++) {//procura o cpf no array
                    Dados sa = la.get(p);
                    if (x.equals(sa.getContrato().getCliente().getCpf())) {//Verifique se o cpf está no array
                        j = p;
                        v = p;
                        new TelaVerContratos(j, arm.getAberto()).setVisible(true);//mostra o contrato de acordo com o cpf
                        break;
                    }
                }
            }
        }
        if (v == -1) {
            JOptionPane.showMessageDialog(null, "CPF não encontrado");//Se não encontrar o cpf mostrra a mensagem

        }
        campopesquisa.setText("");


    }//GEN-LAST:event_btvercontratosActionPerformed

    private void quartosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_quartosStateChanged
         Date in = dtcheckin.getDate();
        Date out = dtcheckout.getDate();
        
        
        if(in!=null&&out!=null){
        int compare = out.compareTo(in);
        
        if (compare == 0) {
            dataerrada.setText("*Datas iguais");
        }
        if (compare < 0) {
            dataerrada.setText("*Chekout menor que checkin.");
        }
        
        if (compare > 0) {
            dataerrada.setText("");
        }}
        if (!camponome.getText().equals("") && !campocpf.getText().equals("") && !campoendereco.getText().equals("") && !campotelefone.getText().equals("") && !campocartao.getText().equals("")
                && dtcheckout.getDate()!= null && dtcheckin.getDate()!=null &&(!tipop.equals("")||!tipols.equals("")||!tipold.equals("")||!tipolt.equals("")||!tipoes.equals("")||!tipoed.equals("")||!tipoet.equals("")) && (!nomegravado.getText().equals(""))&&mesano.getText().equals("")&&dataerrada.getText().equals("")) {
            btcadastro.setEnabled(true);
        }else{
            btcadastro.setEnabled(false);
        }
    }//GEN-LAST:event_quartosStateChanged

    private void btceStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btceStateChanged
        Date in = dtcheckin.getDate();
        Date out = dtcheckout.getDate();
        
        
        if(in!=null&&out!=null){
        int compare = out.compareTo(in);
        
        if (compare == 0) {
            dataerrada.setText("*Datas iguais");
        }
        if (compare < 0) {
            dataerrada.setText("*Chekout menor que checkin.");
        }
        
        if (compare > 0) {
            dataerrada.setText("");
        }}
        if (!camponome.getText().equals("") && !campocpf.getText().equals("") && !campoendereco.getText().equals("") && !campotelefone.getText().equals("") && !campocartao.getText().equals("")
                && dtcheckout.getDate()!= null && dtcheckin.getDate()!=null &&(!tipop.equals("")||!tipols.equals("")||!tipold.equals("")||!tipolt.equals("")||!tipoes.equals("")||!tipoed.equals("")||!tipoet.equals("")) && (!nomegravado.getText().equals(""))&&mesano.getText().equals("")&&dataerrada.getText().equals("")) {
            btcadastro.setEnabled(true);
        }else{
            btcadastro.setEnabled(false);
        }
    }//GEN-LAST:event_btceStateChanged

    private void btbabysitterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btbabysitterStateChanged
          Date in = dtcheckin.getDate();
        Date out = dtcheckout.getDate();
        
        
        if(in!=null&&out!=null){
        int compare = out.compareTo(in);
        
        if (compare == 0) {
            dataerrada.setText("*Datas iguais");
        }
        if (compare < 0) {
            dataerrada.setText("*Chekout menor que checkin.");
        }
        
        if (compare > 0) {
            dataerrada.setText("");
        }}
        if (!camponome.getText().equals("") && !campocpf.getText().equals("") && !campoendereco.getText().equals("") && !campotelefone.getText().equals("") && !campocartao.getText().equals("")
                && dtcheckout.getDate()!= null && dtcheckin.getDate()!=null &&(!tipop.equals("")||!tipols.equals("")||!tipold.equals("")||!tipolt.equals("")||!tipoes.equals("")||!tipoed.equals("")||!tipoet.equals("")) && (!nomegravado.getText().equals(""))&&mesano.getText().equals("")&&dataerrada.getText().equals("")) {
            btcadastro.setEnabled(true);
        }else{
            btcadastro.setEnabled(false);
        }
    }//GEN-LAST:event_btbabysitterStateChanged

    private void btadcStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btadcStateChanged
          Date in = dtcheckin.getDate();
        Date out = dtcheckout.getDate();
        
        
        if(in!=null&&out!=null){
        int compare = out.compareTo(in);
        
        if (compare == 0) {
            dataerrada.setText("*Datas iguais");
        }
        if (compare < 0) {
            dataerrada.setText("*Chekout menor que checkin.");
        }
        
        if (compare > 0) {
            dataerrada.setText("");
        }}
        if (!camponome.getText().equals("") && !campocpf.getText().equals("") && !campoendereco.getText().equals("") && !campotelefone.getText().equals("") && !campocartao.getText().equals("")
                && dtcheckout.getDate()!= null && dtcheckin.getDate()!=null &&(!tipop.equals("")||!tipols.equals("")||!tipold.equals("")||!tipolt.equals("")||!tipoes.equals("")||!tipoed.equals("")||!tipoet.equals("")) && (!nomegravado.getText().equals(""))&&mesano.getText().equals("")&&dataerrada.getText().equals("")) {
            btcadastro.setEnabled(true);
        }else{
            btcadastro.setEnabled(false);
        }
    }//GEN-LAST:event_btadcStateChanged

    private void bttransferStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_bttransferStateChanged
          Date in = dtcheckin.getDate();
        Date out = dtcheckout.getDate();
        
        
        if(in!=null&&out!=null){
        int compare = out.compareTo(in);
        
        if (compare == 0) {
            dataerrada.setText("*Datas iguais");
        }
        if (compare < 0) {
            dataerrada.setText("*Chekout menor que checkin.");
        }
        
        if (compare > 0) {
            dataerrada.setText("");
        }}
        if (!camponome.getText().equals("") && !campocpf.getText().equals("") && !campoendereco.getText().equals("") && !campotelefone.getText().equals("") && !campocartao.getText().equals("")
                && dtcheckout.getDate()!= null && dtcheckin.getDate()!=null &&(!tipop.equals("")||!tipols.equals("")||!tipold.equals("")||!tipolt.equals("")||!tipoes.equals("")||!tipoed.equals("")||!tipoet.equals("")) && (!nomegravado.getText().equals(""))&&mesano.getText().equals("")&&dataerrada.getText().equals("")) {
            btcadastro.setEnabled(true);
        }else{
            btcadastro.setEnabled(false);
        }
    }//GEN-LAST:event_bttransferStateChanged

    private void btmassagemStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btmassagemStateChanged
          Date in = dtcheckin.getDate();
        Date out = dtcheckout.getDate();
        
        
        if(in!=null&&out!=null){
        int compare = out.compareTo(in);
        
        if (compare == 0) {
            dataerrada.setText("*Datas iguais");
        }
        if (compare < 0) {
            dataerrada.setText("*Chekout menor que checkin.");
        }
        
        if (compare > 0) {
            dataerrada.setText("");
        }}
        if (!camponome.getText().equals("") && !campocpf.getText().equals("") && !campoendereco.getText().equals("") && !campotelefone.getText().equals("") && !campocartao.getText().equals("")
                && dtcheckout.getDate()!= null && dtcheckin.getDate()!=null &&(!tipop.equals("")||!tipols.equals("")||!tipold.equals("")||!tipolt.equals("")||!tipoes.equals("")||!tipoed.equals("")||!tipoet.equals("")) && (!nomegravado.getText().equals(""))&&mesano.getText().equals("")&&dataerrada.getText().equals("")) {
            btcadastro.setEnabled(true);
        }else{
            btcadastro.setEnabled(false);
        }
    }//GEN-LAST:event_btmassagemStateChanged

    private void btpgStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btpgStateChanged
           Date in = dtcheckin.getDate();
        Date out = dtcheckout.getDate();
        
        
        if(in!=null&&out!=null){
        int compare = out.compareTo(in);
        
        if (compare == 0) {
            dataerrada.setText("*Datas iguais");
        }
        if (compare < 0) {
            dataerrada.setText("*Chekout menor que checkin.");
        }
        
        if (compare > 0) {
            dataerrada.setText("");
        }}
        if (!camponome.getText().equals("") && !campocpf.getText().equals("") && !campoendereco.getText().equals("") && !campotelefone.getText().equals("") && !campocartao.getText().equals("")
                && dtcheckout.getDate()!= null && dtcheckin.getDate()!=null &&(!tipop.equals("")||!tipols.equals("")||!tipold.equals("")||!tipolt.equals("")||!tipoes.equals("")||!tipoed.equals("")||!tipoet.equals("")) && (!nomegravado.getText().equals(""))&&mesano.getText().equals("")&&dataerrada.getText().equals("")) {
            btcadastro.setEnabled(true);
        }else{
            btcadastro.setEnabled(false);
        }
    }//GEN-LAST:event_btpgStateChanged

    private void btrestauranteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btrestauranteStateChanged
           Date in = dtcheckin.getDate();
        Date out = dtcheckout.getDate();
        
        
        if(in!=null&&out!=null){
        int compare = out.compareTo(in);
        
        if (compare == 0) {
            dataerrada.setText("*Datas iguais");
        }
        if (compare < 0) {
            dataerrada.setText("*Chekout menor que checkin.");
        }
        
        if (compare > 0) {
            dataerrada.setText("");
        }}
        if (!camponome.getText().equals("") && !campocpf.getText().equals("") && !campoendereco.getText().equals("") && !campotelefone.getText().equals("") && !campocartao.getText().equals("")
                && dtcheckout.getDate()!= null && dtcheckin.getDate()!=null &&(!tipop.equals("")||!tipols.equals("")||!tipold.equals("")||!tipolt.equals("")||!tipoes.equals("")||!tipoed.equals("")||!tipoet.equals("")) && (!nomegravado.getText().equals(""))&&mesano.getText().equals("")&&dataerrada.getText().equals("")) {
            btcadastro.setEnabled(true);
        }else{
            btcadastro.setEnabled(false);
        }
    }//GEN-LAST:event_btrestauranteStateChanged

    private void removerpStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_removerpStateChanged
        Date in = dtcheckin.getDate();
        Date out = dtcheckout.getDate();
        if(in!=null&&out!=null){
        int compare = out.compareTo(in);
        
        if (compare == 0) {
            dataerrada.setText("*Datas iguais");
        }
        if (compare < 0) {
            dataerrada.setText("*Chekout menor que checkin.");
        }
        
        if (compare > 0) {
            dataerrada.setText("");
        }}
        if (!camponome.getText().equals("") && !campocpf.getText().equals("") && !campoendereco.getText().equals("") && !campotelefone.getText().equals("") && !campocartao.getText().equals("")
                && dtcheckout.getDate()!= null && dtcheckin.getDate()!=null &&(!tipop.equals("")||!tipols.equals("")||!tipold.equals("")||!tipolt.equals("")||!tipoes.equals("")||!tipoed.equals("")||!tipoet.equals("")) && (!nomegravado.getText().equals(""))&&mesano.getText().equals("")&&dataerrada.getText().equals("")) {
            btcadastro.setEnabled(true);
        }else{
            btcadastro.setEnabled(false);
        }
    }//GEN-LAST:event_removerpStateChanged

    private void removeretStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_removeretStateChanged
          Date in = dtcheckin.getDate();
        Date out = dtcheckout.getDate();
        if(in!=null&&out!=null){
        int compare = out.compareTo(in);
        
        if (compare == 0) {
            dataerrada.setText("*Datas iguais");
        }
        if (compare < 0) {
            dataerrada.setText("*Chekout menor que checkin.");
        }
        
        if (compare > 0) {
            dataerrada.setText("");
        }}
        if (!camponome.getText().equals("") && !campocpf.getText().equals("") && !campoendereco.getText().equals("") && !campotelefone.getText().equals("") && !campocartao.getText().equals("")
                && dtcheckout.getDate()!= null && dtcheckin.getDate()!=null &&(!tipop.equals("")||!tipols.equals("")||!tipold.equals("")||!tipolt.equals("")||!tipoes.equals("")||!tipoed.equals("")||!tipoet.equals("")) && (!nomegravado.getText().equals(""))&&mesano.getText().equals("")&&dataerrada.getText().equals("")) {
            btcadastro.setEnabled(true);
        }else{
            btcadastro.setEnabled(false);
        }
    }//GEN-LAST:event_removeretStateChanged

    private void removerlsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_removerlsStateChanged
         Date in = dtcheckin.getDate();
        Date out = dtcheckout.getDate();
        if(in!=null&&out!=null){
        int compare = out.compareTo(in);
        
        if (compare == 0) {
            dataerrada.setText("*Datas iguais");
        }
        if (compare < 0) {
            dataerrada.setText("*Chekout menor que checkin.");
        }
        
        if (compare > 0) {
            dataerrada.setText("");
        }}
        if (!camponome.getText().equals("") && !campocpf.getText().equals("") && !campoendereco.getText().equals("") && !campotelefone.getText().equals("") && !campocartao.getText().equals("")
                && dtcheckout.getDate()!= null && dtcheckin.getDate()!=null &&(!tipop.equals("")||!tipols.equals("")||!tipold.equals("")||!tipolt.equals("")||!tipoes.equals("")||!tipoed.equals("")||!tipoet.equals("")) && (!nomegravado.getText().equals(""))&&mesano.getText().equals("")&&dataerrada.getText().equals("")) {
            btcadastro.setEnabled(true);
        }else{
            btcadastro.setEnabled(false);
        }
    }//GEN-LAST:event_removerlsStateChanged

    private void removerldStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_removerldStateChanged
         Date in = dtcheckin.getDate();
        Date out = dtcheckout.getDate();
        
        
        if(in!=null&&out!=null){
        int compare = out.compareTo(in);
        
        if (compare == 0) {
            dataerrada.setText("*Datas iguais");
        }
        if (compare < 0) {
            dataerrada.setText("*Chekout menor que checkin.");
        }
        
        if (compare > 0) {
            dataerrada.setText("");
        }}
        
        if (!camponome.getText().equals("") && !campocpf.getText().equals("") && !campoendereco.getText().equals("") && !campotelefone.getText().equals("") && !campocartao.getText().equals("")
                && dtcheckout.getDate()!= null && dtcheckin.getDate()!=null &&(!tipop.equals("")||!tipols.equals("")||!tipold.equals("")||!tipolt.equals("")||!tipoes.equals("")||!tipoed.equals("")||!tipoet.equals("")) && (!nomegravado.getText().equals(""))&&mesano.getText().equals("")&&dataerrada.getText().equals("")) {
            btcadastro.setEnabled(true);
        }else{
            btcadastro.setEnabled(false);
        }
    }//GEN-LAST:event_removerldStateChanged

    private void removeredStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_removeredStateChanged
        if (!camponome.getText().equals("") && !campocpf.getText().equals("") && !campoendereco.getText().equals("") && !campotelefone.getText().equals("") && !campocartao.getText().equals("")
                && dtcheckout.getDate()!= null && dtcheckin.getDate()!=null &&(!tipop.equals("")||!tipols.equals("")||!tipold.equals("")||!tipolt.equals("")||!tipoes.equals("")||!tipoed.equals("")||!tipoet.equals("")) && (!nomegravado.getText().equals(""))&&mesano.getText().equals("")&&dataerrada.getText().equals("")) {
            btcadastro.setEnabled(true);
        }else{
            btcadastro.setEnabled(false);
        }
    }//GEN-LAST:event_removeredStateChanged

    private void removeresStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_removeresStateChanged
        if (!camponome.getText().equals("") && !campocpf.getText().equals("") && !campoendereco.getText().equals("") && !campotelefone.getText().equals("") && !campocartao.getText().equals("")
                && dtcheckout.getDate()!= null && dtcheckin.getDate()!=null &&(!tipop.equals("")||!tipols.equals("")||!tipold.equals("")||!tipolt.equals("")||!tipoes.equals("")||!tipoed.equals("")||!tipoet.equals("")) && (!nomegravado.getText().equals(""))&&mesano.getText().equals("")&&dataerrada.getText().equals("")) {
            btcadastro.setEnabled(true);
        }else{
            btcadastro.setEnabled(false);
        }
    }//GEN-LAST:event_removeresStateChanged

    private void campocartaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campocartaoKeyReleased
        /*if (evt.getKeyCode() == evt.VK_V) {
            if (evt.isControlDown()) {
                JOptionPane.showMessageDialog(null, "O sistema não permite colar dígitos! \n Forneça manualmente.", "Tente Novamente", JOptionPane.WARNING_MESSAGE);
                campocartao.setText("");
            }
        }*/

        if (totalDigitosCampo() == 0) {
            nenhum.setEnabled(true);
            master.setEnabled(false);
            visa.setEnabled(false);
            american.setEnabled(false);
            disners.setEnabled(false);

        } else {
            /* Verificação se é o 1º dígito e se começa com 0, 1, 2, 7, 8, ou 9 | Se for, o cartão é INVÁLIDO  */
            if (totalDigitosCampo() == 1 && (evt.getKeyCode() == 48 || evt.getKeyCode() == 49 || evt.getKeyCode() == 50 || evt.getKeyCode() == 55 || evt.getKeyCode() == 56 || evt.getKeyCode() == 57)) {
                nenhum.setEnabled(true);
            } else {
                /* Verificação se é o primeiro digito e se ele é o 4, caso SIM então é VISA */
                if (totalDigitosCampo() == 1) {
                    if (evt.getKeyCode() == 52) {
                        nenhum.setEnabled(false);
                        master.setEnabled(false);
                        visa.setEnabled(true);
                        american.setEnabled(false);
                        disners.setEnabled(false);
                    } else {
                        nenhum.setEnabled(true);
                    }
                } else {
                    // Se o usuário tiver digitado 2 números começa a identificar a bandeira de cartões MASTER / DINERS / AMEX
                    if (totalDigitosCampo() == 2) {
                        // Bandeira MASTER CARD
                        if (campo().substring(0, 2).equals("51") || campo().substring(0, 2).equals("52") || campo().substring(0, 2).equals("53") || campo().substring(0, 2).equals("54") || campo().substring(0, 2).equals("55") || campo().substring(0, 2).equals("58")) {
                            nenhum.setEnabled(false);
                            master.setEnabled(true);
                            visa.setEnabled(false);
                            american.setEnabled(false);
                            disners.setEnabled(false);
                        } else { // Bandeira DINERS CLUB 
                            if (campo().substring(0, 2).equals("30") || campo().substring(0, 2).equals("36") || campo().substring(0, 2).equals("38") || campo().substring(0, 2).equals("39")) {
                                nenhum.setEnabled(false);
                                master.setEnabled(false);
                                visa.setEnabled(false);
                                american.setEnabled(false);
                                disners.setEnabled(true);
                            } else {
                                if (campo().substring(0, 2).equals("64") || campo().substring(0, 2).equals("65")) {
                                    nenhum.setEnabled(true);
                                    master.setEnabled(false);
                                    visa.setEnabled(false);
                                    american.setEnabled(false);
                                    disners.setEnabled(false);
                                } else { // Bandeira AMEX
                                    if (campo().substring(0, 2).equals("34") || campo().substring(0, 2).equals("37")) {
                                        nenhum.setEnabled(false);
                                        master.setEnabled(false);
                                        visa.setEnabled(false);
                                        american.setEnabled(true);
                                        disners.setEnabled(false);
                                    } else {
                                        if (campo().substring(0, 2).equals("35")) {
                                            nenhum.setEnabled(true);
                                            master.setEnabled(false);
                                            visa.setEnabled(false);
                                            american.setEnabled(false);
                                            disners.setEnabled(false);
                                        }
                                    }
                                }
                            }
                        }
                    } else { // 4 Dígitos
                        if (totalDigitosCampo() == 4 && campo().substring(0, 4).equals("6011")) {

                        } else { // Se o campo foi totalmente preenchido verifico se ele é válido
                            if (totalDigitosCampo() == 16) {
                                if (validaCartao()) {

                                } else {
                                    nenhum.setEnabled(true);
                                    master.setEnabled(false);
                                    visa.setEnabled(false);
                                    american.setEnabled(false);
                                    disners.setEnabled(false);
                                }

                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_campocartaoKeyReleased

    private void mesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_mesStateChanged
        //verificaCartao();
        int dtmes = (int)mes.getValue();
        int dtano = (int)ano.getValue();
        if (dtmes< 6 && dtano == 18) {
            mesano.setText("*Data inválida");}
        else{
            mesano.setText("");
        }
    }//GEN-LAST:event_mesStateChanged

    private void anoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_anoStateChanged
        //verificaCartao();
        int dtmes = (int)mes.getValue();
        int dtano = (int)ano.getValue();
        if (dtmes< 6 && dtano == 18) {
            mesano.setText("*Data inválida");}
        else{
            mesano.setText("");
        }
    }//GEN-LAST:event_anoStateChanged

    private void removerldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerldActionPerformed
        int j = tabelacadastro.getSelectedRow();//remover o quarto luxo duplo
        arm.getAberto().get(j).getQuarto().getLd().setValorld(0);
        arm.getAberto().get(j).getQuarto().getLd().setQuartoz("");
        TelaAddQuarto.b += arm.getAberto().get(j).getContrato().getCliente().getContld();
        preencherTabela();
    }//GEN-LAST:event_removerldActionPerformed

    private void removerltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerltActionPerformed
        int j = tabelacadastro.getSelectedRow();//remover o quarto luxo triplo
        arm.getAberto().get(j).getQuarto().getLt().setValorlt(0);
        arm.getAberto().get(j).getQuarto().getLt().setQuartoz("");
        TelaAddQuarto.c += arm.getAberto().get(j).getContrato().getCliente().getContlt();
        preencherTabela();
    }//GEN-LAST:event_removerltActionPerformed

    private void dtcheckinKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dtcheckinKeyReleased
          Date in = dtcheckin.getDate();
        Date out = dtcheckout.getDate();
        
        int compare = out.compareTo(in);
        
        if (compare == 0) {
            dataerrada.setText("*Dtas iguais");
        }
        if (compare < 0) {
            dataerrada.setText("*Chekout menor que checkin.");
        }
        
        if (compare > 0) {
            dataerrada.setText("");
        }
    }//GEN-LAST:event_dtcheckinKeyReleased

    private void dtcheckoutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dtcheckoutKeyReleased
          Date in = dtcheckin.getDate();
        Date out = dtcheckout.getDate();
        
        int compare = out.compareTo(in);
        
        if (compare == 0) {
            dataerrada.setText("*Dtas iguais");
        }
        if (compare < 0) {
            dataerrada.setText("*Chekout menor que checkin.");
        }
        
        if (compare > 0) {
            dataerrada.setText("");
        }
    }//GEN-LAST:event_dtcheckoutKeyReleased
    public int totalDigitosCampo() { // Removedo todos os espaços do campo cartao
        String aux = campocartao.getText().trim().replace("  ", "").replace(" ", "");
        return aux.length();
    }

    public boolean validaCartao() {
        // Pego SOMENTE os NÚMEROS desconsiderando os espaços
        String digitosCartao = campocartao.getText().replace("  ", "").replace(" ", "");

        // Começo a aplicar o Algoritmo de Luhn
        int digitoVerificador = Integer.parseInt(digitosCartao.substring(15));
        int aux, digitoVerificacao, soma = 0;

        for (int i = 0; i < 15; i++) {
            aux = Integer.parseInt(digitosCartao.substring(i, i + 1));
            if (i % 2 == 0) {
                aux *= 2;
                if (aux >= 10) {
                    soma += (aux % 10) + 1;
                } else {
                    soma += aux;
                }
            } else {
                soma += aux;
            }
        }

        digitoVerificacao = soma % 10;

        for (int i = 1; i < 10; i++) {
            if ((soma + i) % 10 == 0) {
                digitoVerificacao = i;
                break;
            }
        }

        if (digitoVerificacao == digitoVerificador) {
            return true;
        } else {
            return false;
        }
    }

    /*
    public boolean verificaCartao() {
        String x = cod.getText();
        int codigo = 0;
        codigo = Integer.parseInt(x);
        Date agora = new Date();

        int mes1 = agora.getMonth() + 1;
        int ano1 = agora.getYear() + 1900;

        int mescartao = (int) mes.getValue();
        int anocartao = (int) ano.getValue();

        if ((!nomegravado.getText().equals("")) && (codigo > 99 && codigo < 1000) && ((mescartao >= mes1 && anocartao >= ano1) || (anocartao > ano1 && mescartao < mes1 || mescartao == mes1 || mescartao > mes1))) {
            return true;
        } else {

            return false;
        }
    }*/
    public String campo() {
        return campocartao.getText();
    }

    public Armazenador getArm() {
        return arm;
    }

    public void setArm(Armazenador arm) {
        this.arm = arm;
    }

    public static ArrayList<Dados> getLa() {
        return la;
    }

    public static void setLa(ArrayList<Dados> la) {
        TelaCadastro.la = la;
    }

    void preencherTabela() {
        DefaultTableModel model = (DefaultTableModel) tabelacadastro.getModel();
        model.setNumRows(0);
        la = arm.retornarLista();
        for (Dados d : la) {
            model.addRow(new Object[]{d.getContrato().getCliente().getStatus(), d.getContrato().getCliente().getNome(), d.getContrato().getCliente().getCpf(), d.getContrato().getCliente().getData1(), d.getContrato().getCliente().getData2(), d.getQuarto().toString(), d.getServicoadd().getAc(), d.getServicoadd().getBs().getValorbaba(), d.getServicoadd().getCe().getValorce(), d.getServicoadd().getTrans().toString(), d.getServicoadd().getMas().getValormas(), d.getServicoadd().getPg().getValorpg(), d.getServicoadd().getR().getValortotal(), d.getValor(), d.getContrato().getCliente().getTarifacao()});
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton american;
    private javax.swing.JSpinner ano;
    private javax.swing.JButton btadc;
    private javax.swing.JButton btbabysitter;
    private javax.swing.JButton btcadastro;
    private javax.swing.JButton btce;
    private javax.swing.JButton btcontratosfechados;
    private javax.swing.JButton bteditar;
    private javax.swing.JButton btfecharcontrato;
    private javax.swing.JButton btmassagem;
    private javax.swing.JButton btnovocontrato;
    private javax.swing.JButton btpg;
    private javax.swing.JButton btremoveradc;
    private javax.swing.JButton btremoveralacarte;
    private javax.swing.JButton btremoverbebidas;
    private javax.swing.JButton btremoverbs;
    private javax.swing.JButton btremoverce;
    private javax.swing.JButton btremovermas;
    private javax.swing.JButton btremoverpg;
    private javax.swing.JButton btremoverss;
    private javax.swing.JButton btrestaurante;
    private javax.swing.JButton bttodoscontratos;
    private javax.swing.JButton bttransfer;
    private javax.swing.JButton btvercontratos;
    private javax.swing.JFormattedTextField campocartao;
    private javax.swing.JFormattedTextField campocpf;
    private javax.swing.JTextField campoendereco;
    private javax.swing.JTextField camponome;
    private javax.swing.JFormattedTextField campopesquisa;
    private javax.swing.JFormattedTextField campotelefone;
    private javax.swing.JFormattedTextField cod;
    private javax.swing.JTextField dataerrada;
    private javax.swing.JButton disners;
    private com.toedter.calendar.JDateChooser dtcheckin;
    private com.toedter.calendar.JDateChooser dtcheckout;
    private javax.swing.JButton fe;
    private javax.swing.JRadioButton fem;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton ma;
    private javax.swing.JRadioButton mas;
    private javax.swing.JButton master;
    private javax.swing.JSpinner mes;
    private javax.swing.JTextField mesano;
    private javax.swing.JButton nenhum;
    private javax.swing.JFormattedTextField nomegravado;
    private javax.swing.JButton quartos;
    private javax.swing.JButton removered;
    private javax.swing.JButton removeres;
    private javax.swing.JButton removeret;
    private javax.swing.JButton removerld;
    private javax.swing.JButton removerls;
    private javax.swing.JButton removerlt;
    private javax.swing.JButton removerp;
    private javax.swing.ButtonGroup sexo;
    private javax.swing.JTable tabelacadastro;
    private javax.swing.JButton visa;
    // End of variables declaration//GEN-END:variables
}
