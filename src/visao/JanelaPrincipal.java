package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;

public class JanelaPrincipal extends JFrame {

	private JPanel contentPane;
	public JPanel panel;
	private JMenuItem itemAdmissao;
	private JMenuItem itemListaInternados;
	private JMenuItem itemAlta;
	private JMenuItem itemMedicamentos;
	private JMenuItem itemPrescrever;
	private JPanel panelAdmissao;
	private JPanel panelListaInternados;
	private JPanel panelAlta;
	private JPanel panelMedicamentos;
	private JPanel panelPrescrever;
	private JTextField fieldCpfAdmissao;
	private JTextField fieldNomeAdmissao;
	private JTextField fieldDataNascAdmissao;
	private JTextField fieldCodBarrasMedicamentos;
	private JTextField fieldNomeMedicamentos;
	private JTextField fieldCpfAlta;
	private JTextField fieldCpfPrescrever;
	private JTextField fieldNomePrescrever;
	private JTextField fieldDataNascPrescrever;
	private JTextField fieldMedNormalPrescrever;
	private JTextField fieldMedProtegidoPrescrever;
	private JComboBox<String> comboBoxMotivo;
	private JComboBox<String> comboBoxUnidade;
	private JCheckBox checkBoxPenicilinaAdmissao;
	private JCheckBox checkBoxGlutenAdmissao;
	private JCheckBox checkBoxFrutosDoMarAdmissao;
	private JCheckBox checkBoxDipironAdmissao;
	private JCheckBox checkBoxPenicilinaPrescrever;
	private JCheckBox checkBoxGlutenPrescrever;
	private JCheckBox checkBoxFrutosDoMarPrescrever;
	private JCheckBox checkBoxDipironaPrescrever;
	private JCheckBox checkBoxPenicilinaMedicamentos;
	private JCheckBox checkBoxGlutenMedicamentos;
	private JCheckBox checkBoxFrutosDoMarMedicamentos;
	private JCheckBox checkBoxDipironaMedicamentos;
	private JCheckBox checkBoxPenicilinaAlergia;
	private JCheckBox checkBoxGlutenAlergia;
	private JCheckBox checkBoxFrutosDoMarAlergia;
	private JCheckBox checkBoxDipironaAlergia;
	private JButton botaoCancelarAdmissao;
	private JButton botaoCancelarListaInternados;
	private JButton botaoCancelarAlta;
	private JButton botaoCancelarMedicamentos;
	private JButton botaoCancelarPrescrever;
	private JButton botaoSalvarAdmissao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipal frame = new JanelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JanelaPrincipal() {
		setTitle("Sistema de Prescrição Médica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menuPaciente = new JMenu("Paciente");
		menuBar.add(menuPaciente);

		itemAdmissao = new JMenuItem("Admiss\u00E3o");
		menuPaciente.add(itemAdmissao);

		itemListaInternados = new JMenuItem("Lista de Internados");
		menuPaciente.add(itemListaInternados);

		itemAlta = new JMenuItem("Alta");
		menuPaciente.add(itemAlta);

		JMenu menuPrescrição = new JMenu("Prescri\u00E7\u00E3o");
		menuBar.add(menuPrescrição);

		itemMedicamentos = new JMenuItem("Medicamentos");
		menuPrescrição.add(itemMedicamentos);

		itemPrescrever = new JMenuItem("Prescrever");
		menuPrescrição.add(itemPrescrever);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));

		panel = new JPanel();
		contentPane.add(panel, "name_274384895752500");

		panelAdmissao = new JPanel();
		contentPane.add(panelAdmissao, BorderLayout.CENTER);
		panelAdmissao.setLayout(new MigLayout("", "[93.00][250.00,grow][][100.00][100.00]",
				"[][35.00][35.00][35.00][][37.00][][][][][][][27.00]"));

		JLabel labelDadosPaciente = new JLabel("Dados do Paciente: ");
		labelDadosPaciente.setFont(new Font("Tahoma", Font.BOLD, 13));
		panelAdmissao.add(labelDadosPaciente, "cell 0 0,alignx left");

		JLabel labelAlergiasAdmissao = new JLabel("Alergias:");
		labelAlergiasAdmissao.setFont(new Font("Tahoma", Font.BOLD, 13));
		panelAdmissao.add(labelAlergiasAdmissao, "cell 3 0");

		JLabel labelCpfAdmissao = new JLabel("CPF: ");
		labelCpfAdmissao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		labelCpfAdmissao.setHorizontalAlignment(SwingConstants.LEFT);
		panelAdmissao.add(labelCpfAdmissao, "cell 0 1,alignx left");

		fieldCpfAdmissao = new JTextField();
		fieldCpfAdmissao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelAdmissao.add(fieldCpfAdmissao, "cell 1 1,growx");
		fieldCpfAdmissao.setColumns(10);

		JCheckBox checkBoxGlutenAdmissao = new JCheckBox("Gl\u00FAten");
		checkBoxGlutenAdmissao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelAdmissao.add(checkBoxGlutenAdmissao, "cell 3 1");
		this.setCheckBoxGlutenAdmissao(checkBoxGlutenAdmissao);

		JCheckBox checkBoxDipironaAdmissao = new JCheckBox("Dipirona");
		checkBoxDipironaAdmissao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelAdmissao.add(checkBoxDipironaAdmissao, "cell 4 1");
		this.setCheckBoxDipironAdmissao(checkBoxDipironaAdmissao);

		JLabel labelNomeAdmissao = new JLabel("Nome: ");
		labelNomeAdmissao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelAdmissao.add(labelNomeAdmissao, "cell 0 2,alignx left");

		fieldNomeAdmissao = new JTextField();
		fieldNomeAdmissao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelAdmissao.add(fieldNomeAdmissao, "cell 1 2,growx");
		fieldNomeAdmissao.setColumns(10);

		JCheckBox checkBoxFrutosDoMarAdmissao = new JCheckBox("Frutos do mar");
		checkBoxFrutosDoMarAdmissao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelAdmissao.add(checkBoxFrutosDoMarAdmissao, "cell 3 2");
		this.setCheckBoxFrutosDoMarAdmissao(checkBoxFrutosDoMarAdmissao);

		JCheckBox checkBoxPenicilinaAdmissao = new JCheckBox("Penicilina");
		checkBoxPenicilinaAdmissao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelAdmissao.add(checkBoxPenicilinaAdmissao, "cell 4 2");
		this.setCheckBoxPenicilinaAdmissao(checkBoxPenicilinaAdmissao);

		JLabel labelDataNascAdmissao = new JLabel("Data Nasc:");
		labelDataNascAdmissao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelAdmissao.add(labelDataNascAdmissao, "cell 0 3,alignx left");

		fieldDataNascAdmissao = new JTextField();
		fieldDataNascAdmissao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelAdmissao.add(fieldDataNascAdmissao, "cell 1 3,growx");
		fieldDataNascAdmissao.setColumns(10);

		JLabel labelDadosAdmissao = new JLabel("Dados de admiss\u00E3o:");
		labelDadosAdmissao.setFont(new Font("Tahoma", Font.BOLD, 13));
		panelAdmissao.add(labelDadosAdmissao, "cell 0 5");

		JLabel labelUnidadeAdmissao = new JLabel("Unidade: ");
		labelUnidadeAdmissao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelAdmissao.add(labelUnidadeAdmissao, "cell 0 6,alignx left");
		this.setcomboBoxUnidade(comboBoxUnidade);

		comboBoxUnidade = new JComboBox<String>();
		comboBoxUnidade.addItem("");
		comboBoxUnidade.addItem("Ambulatório");
		comboBoxUnidade.addItem("Emergência");
		comboBoxUnidade.addItem("UTI");
		panelAdmissao.add(comboBoxUnidade, "cell 1 6,growx");

		botaoSalvarAdmissao = new JButton("Salvar");
		botaoSalvarAdmissao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		botaoSalvarAdmissao.setPreferredSize(new Dimension(100, 25));
		panelAdmissao.add(botaoSalvarAdmissao, "cell 0 12");

		JButton botaoCancelarAdmissao = new JButton("Cancelar");
		botaoCancelarAdmissao.setPreferredSize(new Dimension(100, 25));
		botaoCancelarAdmissao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelAdmissao.add(botaoCancelarAdmissao, "cell 1 12");
		this.setBotaoCancelarAdmissao(botaoCancelarAdmissao);

		panelListaInternados = new JPanel();
		contentPane.add(panelListaInternados, "name_275041430877799");
		panelListaInternados
				.setLayout(new MigLayout("", "[263.00,grow][101.00,grow][117.00,grow][128.00]", "[][grow][]"));

		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		panelListaInternados.add(lblNewLabel, "cell 0 0");

		JLabel labelUnidadeInternados = new JLabel("Unidade:");
		labelUnidadeInternados.setFont(new Font("Tahoma", Font.BOLD, 13));
		panelListaInternados.add(labelUnidadeInternados, "cell 1 0");

		JLabel labelDataNascInternados = new JLabel("Data Nasc:");
		labelDataNascInternados.setFont(new Font("Tahoma", Font.BOLD, 13));
		panelListaInternados.add(labelDataNascInternados, "cell 2 0");

		JLabel labelAlergiasInternados = new JLabel("Alergias:");
		labelAlergiasInternados.setFont(new Font("Tahoma", Font.BOLD, 13));
		panelListaInternados.add(labelAlergiasInternados, "cell 3 0");

		JScrollPane scroolPaneNomeInternados = new JScrollPane();
		panelListaInternados.add(scroolPaneNomeInternados, "cell 0 1,grow");

		JTextArea textAreaNomeInternados = new JTextArea();
		scroolPaneNomeInternados.setViewportView(textAreaNomeInternados);
		scroolPaneNomeInternados.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		JScrollPane scroolPaneUnidadeInternados = new JScrollPane();
		panelListaInternados.add(scroolPaneUnidadeInternados, "cell 1 1,grow");

		JTextArea textAreaUnidadeInternados = new JTextArea();
		scroolPaneUnidadeInternados.setViewportView(textAreaUnidadeInternados);
		scroolPaneUnidadeInternados.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		JScrollPane scrollPaneDataNascInternados = new JScrollPane();
		panelListaInternados.add(scrollPaneDataNascInternados, "cell 2 1,grow");

		JTextArea textAreaDataNascInternados = new JTextArea();
		scrollPaneDataNascInternados.setViewportView(textAreaDataNascInternados);
		scrollPaneDataNascInternados.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		JScrollPane scrollPaneAlergiasInternados = new JScrollPane();
		panelListaInternados.add(scrollPaneAlergiasInternados, "cell 3 1,grow");

		JTextArea textAreaAlergiasInternados = new JTextArea();
		scrollPaneAlergiasInternados.setViewportView(textAreaAlergiasInternados);
		scrollPaneAlergiasInternados.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		JButton buttonSalvarInternados = new JButton("Salvar");
		buttonSalvarInternados.setPreferredSize(new Dimension(100, 25));
		buttonSalvarInternados.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelListaInternados.add(buttonSalvarInternados, "flowx,cell 0 2");

		JButton botaoCancelarInternados = new JButton("Cancelar");
		botaoCancelarInternados.setPreferredSize(new Dimension(100, 25));
		botaoCancelarInternados.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelListaInternados.add(botaoCancelarInternados, "cell 0 2");
		this.setBotaoCancelarListaInternados(botaoCancelarListaInternados);

		panelAlta = new JPanel();
		contentPane.add(panelAlta, "name_110402515551900");
		panelAlta.setLayout(
				new MigLayout("", "[120.00,grow][77.00,grow][180.00,grow][150.00,grow]", "[181.00][][166.00,grow][]"));

		JLabel labelCPFAlta = new JLabel("CPF: ");
		labelCPFAlta.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelAlta.add(labelCPFAlta, "cell 1 0,alignx left,aligny bottom");

		fieldCpfAlta = new JTextField();
		fieldCpfAlta.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelAlta.add(fieldCpfAlta, "cell 2 0,growx,aligny bottom");
		fieldCpfAlta.setColumns(10);

		JLabel labelMotivoAlta = new JLabel("Motivo: ");
		labelMotivoAlta.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelAlta.add(labelMotivoAlta, "cell 1 2,alignx left,aligny top");

		JComboBox<String> comboBoxMotivoAlta = new JComboBox<String>();
		comboBoxMotivoAlta.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBoxMotivoAlta.addItem("");
		comboBoxMotivoAlta.addItem("Cura");
		comboBoxMotivoAlta.addItem("Transferência");
		comboBoxMotivoAlta.addItem("Óbito");
		panelAlta.add(comboBoxMotivoAlta, "cell 2 2,growx,aligny top");
		this.setcomboBoxMotivoAlta(comboBoxMotivo);

		JButton botaoSalvarAlta = new JButton("Salvar");
		botaoSalvarAlta.setPreferredSize(new Dimension(100, 25));
		botaoSalvarAlta.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelAlta.add(botaoSalvarAlta, "flowx,cell 0 3");

		JButton botaoCancelarAlta = new JButton("Cancelar");
		botaoCancelarAlta.setPreferredSize(new Dimension(100, 25));
		botaoCancelarAlta.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelAlta.add(botaoCancelarAlta, "cell 1 3");
		this.setBotaoCancelarAlta(botaoCancelarAlta);

		panelMedicamentos = new JPanel();
		contentPane.add(panelMedicamentos, "name_111985365826900");
		panelMedicamentos.setLayout(new MigLayout("", "[116.00][171.00,grow][143.00][191.00]",
				"[][16.00][35.00][35.00][][37.00][][][][][][][][]"));

		JLabel labelDadosMedicamentos = new JLabel("Dados do Medicamento");
		labelDadosMedicamentos.setFont(new Font("Tahoma", Font.BOLD, 13));
		panelMedicamentos.add(labelDadosMedicamentos, "cell 0 0 2 1");

		JLabel labelCodigoDeBarrasMedicamentos = new JLabel("C\u00F3d. Barras: ");
		labelCodigoDeBarrasMedicamentos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelMedicamentos.add(labelCodigoDeBarrasMedicamentos, "cell 0 2,alignx left");

		fieldCodBarrasMedicamentos = new JTextField();
		panelMedicamentos.add(fieldCodBarrasMedicamentos, "cell 1 2 2 1,growx");
		fieldCodBarrasMedicamentos.setColumns(10);

		JLabel labelNomeMedicamentos = new JLabel("Nome:");
		labelNomeMedicamentos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelMedicamentos.add(labelNomeMedicamentos, "cell 0 3,alignx left");

		fieldNomeMedicamentos = new JTextField();
		panelMedicamentos.add(fieldNomeMedicamentos, "cell 1 3 2 1,growx");
		fieldNomeMedicamentos.setColumns(10);

		JLabel labelContraindicadoMedicamentos = new JLabel("Contraindicado para as alergias: ");
		labelContraindicadoMedicamentos.setFont(new Font("Tahoma", Font.BOLD, 13));
		panelMedicamentos.add(labelContraindicadoMedicamentos, "cell 0 6 2 1");

		JCheckBox checkBoxGlutenMedicamentos = new JCheckBox("Glúten");
		checkBoxGlutenMedicamentos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelMedicamentos.add(checkBoxGlutenMedicamentos, "cell 0 7");
		this.setCheckBoxGlutenMedicamentos(checkBoxGlutenMedicamentos);

		JCheckBox checkBoxFrutosDoMarMedicamentos = new JCheckBox("Frutos do Mar");
		checkBoxFrutosDoMarMedicamentos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelMedicamentos.add(checkBoxFrutosDoMarMedicamentos, "cell 1 7");
		this.setCheckBoxFrutosDoMarMedicamentos(checkBoxFrutosDoMarMedicamentos);

		JCheckBox checkBoxPenicilinaMedicamentos = new JCheckBox("Penicilina");
		checkBoxPenicilinaMedicamentos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelMedicamentos.add(checkBoxPenicilinaMedicamentos, "cell 2 7");
		this.setCheckBoxPenicilinaMedicamentos(checkBoxPenicilinaMedicamentos);

		JCheckBox checkBoxDipironaMedicamentos = new JCheckBox("Dipirona");
		checkBoxDipironaMedicamentos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelMedicamentos.add(checkBoxDipironaMedicamentos, "cell 3 7");
		this.setCheckBoxDipironaMedicamentos(checkBoxDipironaMedicamentos);

		JButton botaoSalvarMedicamentos = new JButton("Salvar");
		botaoSalvarMedicamentos.setPreferredSize(new Dimension(100, 25));
		botaoSalvarMedicamentos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelMedicamentos.add(botaoSalvarMedicamentos, "cell 0 13");

		JButton botaoCancelarMedicamentos = new JButton("Cancelar");
		botaoCancelarMedicamentos.setPreferredSize(new Dimension(100, 25));
		botaoCancelarMedicamentos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelMedicamentos.add(botaoCancelarMedicamentos, "cell 1 13");
		this.setBotaoCancelarMedicamentos(botaoCancelarMedicamentos);

		panelPrescrever = new JPanel();
		panelPrescrever.setLayout(new MigLayout("", "[94.00][171.00,grow][41.00][143.00,grow][191.00]",
				"[30.00][16.00][35.00][35.00][30.00][18.00][30.00][43.00][][][][][][]"));

		contentPane.add(panelPrescrever, "name_112809641740600");

		JLabel labelDadosPacientePrescrever = new JLabel("Dados do Paciente:");
		labelDadosPacientePrescrever.setFont(new Font("Tahoma", Font.BOLD, 13));
		panelPrescrever.add(labelDadosPacientePrescrever, "cell 0 0 2 1");

		JLabel labelAlergiasPrescrever = new JLabel("Alergias:");
		labelAlergiasPrescrever.setFont(new Font("Tahoma", Font.BOLD, 13));
		panelPrescrever.add(labelAlergiasPrescrever, "cell 3 0");

		JLabel labelCPFPrescrever = new JLabel("CPF:");
		labelCPFPrescrever.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelPrescrever.add(labelCPFPrescrever, "cell 0 2,alignx left");

		fieldCpfPrescrever = new JTextField();
		fieldCpfPrescrever.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelPrescrever.add(fieldCpfPrescrever, "cell 1 2,growx");
		fieldCpfPrescrever.setColumns(10);

		JCheckBox checkBoxGlutenPrescrever = new JCheckBox("Gl\u00FAten");
		checkBoxGlutenPrescrever.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelPrescrever.add(checkBoxGlutenPrescrever, "cell 3 2");
		this.setCheckBoxGlutenPrescrever(checkBoxGlutenPrescrever);

		JCheckBox checkBoxDipironaPrescrever = new JCheckBox("Dipirona");
		checkBoxDipironaPrescrever.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelPrescrever.add(checkBoxDipironaPrescrever, "cell 4 2");
		this.setCheckBoxDipironaPrescrever(checkBoxDipironaPrescrever);

		JLabel labelNomePrescrever = new JLabel("Nome:");
		labelNomePrescrever.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelPrescrever.add(labelNomePrescrever, "cell 0 3,alignx left");

		fieldNomePrescrever = new JTextField();
		fieldNomePrescrever.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelPrescrever.add(fieldNomePrescrever, "cell 1 3,growx");
		fieldNomePrescrever.setColumns(10);

		JCheckBox checkBoxFrutosDoMarPrescrever = new JCheckBox("Frutos do mar");
		checkBoxFrutosDoMarPrescrever.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelPrescrever.add(checkBoxFrutosDoMarPrescrever, "cell 3 3");
		this.setCheckBoxFrutosDoMarPrescrever(checkBoxFrutosDoMarPrescrever);

		JCheckBox checkBoxPenicilinaPrescrever = new JCheckBox("Penicilina");
		checkBoxPenicilinaPrescrever.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelPrescrever.add(checkBoxPenicilinaPrescrever, "cell 4 3");
		this.setCheckBoxPenicilinaPrescrever(checkBoxPenicilinaPrescrever);

		JLabel labelDataNascPrescrever = new JLabel("Data Nasc:");
		labelDataNascPrescrever.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelPrescrever.add(labelDataNascPrescrever, "cell 0 4,alignx left");

		fieldDataNascPrescrever = new JTextField();
		fieldDataNascPrescrever.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelPrescrever.add(fieldDataNascPrescrever, "cell 1 4,growx");
		fieldDataNascPrescrever.setColumns(10);

		JLabel labelPrescriçãoPrescrever = new JLabel("Prescri\u00E7\u00E3o:");
		labelPrescriçãoPrescrever.setFont(new Font("Tahoma", Font.BOLD, 13));
		panelPrescrever.add(labelPrescriçãoPrescrever, "cell 0 6");

		JLabel labelMedicamentoPrescrever = new JLabel("Medicamento:");
		labelMedicamentoPrescrever.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelPrescrever.add(labelMedicamentoPrescrever, "cell 0 7,alignx trailing");

		fieldMedNormalPrescrever = new JTextField();
		panelPrescrever.add(fieldMedNormalPrescrever, "cell 1 7,growx");
		fieldMedNormalPrescrever.setColumns(10);

		fieldMedProtegidoPrescrever = new JTextField();
		panelPrescrever.add(fieldMedProtegidoPrescrever, "cell 3 7 2 1,growx");
		fieldMedProtegidoPrescrever.setColumns(10);

		JButton botaoSalvarPrescrever = new JButton("Salvar");
		botaoSalvarPrescrever.setPreferredSize(new Dimension(100, 25));
		botaoSalvarPrescrever.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelPrescrever.add(botaoSalvarPrescrever, "cell 0 13");

		JButton botaoCancelarPrescrever = new JButton("Cancelar");
		botaoCancelarPrescrever.setPreferredSize(new Dimension(100, 25));
		botaoCancelarPrescrever.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panelPrescrever.add(botaoCancelarPrescrever, "cell 1 13");
		this.setBotaoCancelarPrescrever(botaoCancelarPrescrever);

	}

	public JMenuItem getItemAdmissao() {
		return itemAdmissao;
	}

	public void setItemAdmissao(JMenuItem itemAdmissao) {
		this.itemAdmissao = itemAdmissao;
	}

	public JMenuItem getItemListaInternados() {
		return itemListaInternados;
	}

	public void setItemListaInternados(JMenuItem itemListaInternados) {
		this.itemListaInternados = itemListaInternados;
	}

	public JMenuItem getItemAlta() {
		return itemAlta;
	}

	public void setItemAlta(JMenuItem itemAlta) {
		this.itemAlta = itemAlta;
	}

	public JMenuItem getItemMedicamentos() {
		return itemMedicamentos;
	}

	public void setItemMedicamentos(JMenuItem itemMedicamentos) {
		this.itemMedicamentos = itemMedicamentos;
	}

	public JMenuItem getItemPrescrever() {
		return itemPrescrever;
	}

	public void setItemPrescrever(JMenuItem itemPrescrever) {
		this.itemPrescrever = itemPrescrever;
	}

	public JPanel getPanelAdmissao() {
		return panelAdmissao;
	}

	public void setPanelAdmissao(JPanel panelAdmissao) {
		this.panelAdmissao = panelAdmissao;
	}

	public JPanel getPanelListaInternados() {
		return panelListaInternados;
	}

	public void setPanelListaInternados(JPanel panelListaInternados) {
		this.panelListaInternados = panelListaInternados;
	}

	public JPanel getPanelAlta() {
		return panelAlta;
	}

	public void setPanelAlta(JPanel panelAlta) {
		this.panelAlta = panelAlta;
	}

	public JPanel getPanelMedicamentos() {
		return panelMedicamentos;
	}

	public void setPanelMedicamentos(JPanel panelMedicamentos) {
		this.panelMedicamentos = panelMedicamentos;
	}

	public JPanel getPanelPrescrever() {
		return panelPrescrever;
	}

	public void setPanelPrescrever(JPanel panelPrescrever) {
		this.panelPrescrever = panelPrescrever;
	}

	public JComboBox<String> getcomboBoxMotivoAlta() {
		return comboBoxMotivo;
	}

	public void setcomboBoxMotivoAlta(JComboBox<String> boxMotivo) {
		this.comboBoxMotivo = boxMotivo;
	}

	public JComboBox<String> getcomboBoxUnidade() {
		return comboBoxUnidade;
	}

	public void setcomboBoxUnidade(JComboBox<String> comboBoxUnidade) {
		this.comboBoxUnidade = comboBoxUnidade;
	}

	public JTextField getFieldCpfAdmissao() {
		return fieldCpfAdmissao;
	}

	public void setFieldCpfAdmissao(JTextField fieldCpfAdmissao) {
		this.fieldCpfAdmissao = fieldCpfAdmissao;
	}

	public JTextField getFieldNomeAdmissao() {
		return fieldNomeAdmissao;
	}

	public void setFieldNomeAdmissao(JTextField fieldNomeAdmissao) {
		this.fieldNomeAdmissao = fieldNomeAdmissao;
	}

	public JTextField getFieldDataNascAdmissao() {
		return fieldDataNascAdmissao;
	}

	public void setFieldDataNascAdmissao(JTextField fieldDataNascAdmissao) {
		this.fieldDataNascAdmissao = fieldDataNascAdmissao;
	}

	public JTextField getFieldCodBarrasMedicamentos() {
		return fieldCodBarrasMedicamentos;
	}

	public void setFieldCodBarrasMedicamentos(JTextField fieldCodBarrasMedicamentos) {
		this.fieldCodBarrasMedicamentos = fieldCodBarrasMedicamentos;
	}

	public JTextField getFieldNomeMedicamentos() {
		return fieldNomeMedicamentos;
	}

	public void setFieldNomeMedicamentos(JTextField fieldNomeMedicamentos) {
		this.fieldNomeMedicamentos = fieldNomeMedicamentos;
	}

	public JTextField getFieldCpfAlta() {
		return fieldCpfAlta;
	}

	public void setFieldCpfAlta(JTextField fieldCpfAlta) {
		this.fieldCpfAlta = fieldCpfAlta;
	}

	public JTextField getFieldCpfPrescrever() {
		return fieldCpfPrescrever;
	}

	public void setFieldCpfPrescrever(JTextField fieldCpfPrescrever) {
		this.fieldCpfPrescrever = fieldCpfPrescrever;
	}

	public JTextField getFieldNomePrescrever() {
		return fieldNomePrescrever;
	}

	public void setFieldNomePrescrever(JTextField fieldNomePrescrever) {
		this.fieldNomePrescrever = fieldNomePrescrever;
	}

	public JTextField getFieldDataNascPrescrever() {
		return fieldDataNascPrescrever;
	}

	public void setFieldDataNascPrescrever(JTextField fieldDataNascPrescrever) {
		this.fieldDataNascPrescrever = fieldDataNascPrescrever;
	}

	public JTextField getFieldMedNormalPrescrever() {
		return fieldMedNormalPrescrever;
	}

	public void setFieldMedNormalPrescrever(JTextField fieldMedNormalPrescrever) {
		this.fieldMedNormalPrescrever = fieldMedNormalPrescrever;
	}

	public JTextField getFieldMedProtegidoPrescrever() {
		return fieldMedProtegidoPrescrever;
	}

	public void setFieldMedProtegidoPrescrever(JTextField fieldMedProtegidoPrescrever) {
		this.fieldMedProtegidoPrescrever = fieldMedProtegidoPrescrever;
	}

	public JComboBox<String> getComboBoxMotivo() {
		return comboBoxMotivo;
	}

	public void setComboBoxMotivo(JComboBox<String> comboBoxMotivo) {
		this.comboBoxMotivo = comboBoxMotivo;
	}

	public JComboBox<String> getComboBoxUnidade() {
		return comboBoxUnidade;
	}

	public void setComboBoxUnidade(JComboBox<String> comboBoxUnidade) {
		this.comboBoxUnidade = comboBoxUnidade;
	}

	public JCheckBox getCheckBoxPenicilinaAdmissao() {
		return checkBoxPenicilinaAdmissao;
	}

	public void setCheckBoxPenicilinaAdmissao(JCheckBox checkBoxPenicilinaAdmissao) {
		this.checkBoxPenicilinaAdmissao = checkBoxPenicilinaAdmissao;
	}

	public JCheckBox getCheckBoxGlutenAdmissao() {
		return checkBoxGlutenAdmissao;
	}

	public void setCheckBoxGlutenAdmissao(JCheckBox checkBoxGlutenAdmissao) {
		this.checkBoxGlutenAdmissao = checkBoxGlutenAdmissao;
	}

	public JCheckBox getCheckBoxFrutosDoMarAdmissao() {
		return checkBoxFrutosDoMarAdmissao;
	}

	public void setCheckBoxFrutosDoMarAdmissao(JCheckBox checkBoxFrutosDoMarAdmissao) {
		this.checkBoxFrutosDoMarAdmissao = checkBoxFrutosDoMarAdmissao;
	}

	public JCheckBox getCheckBoxDipironAdmissao() {
		return checkBoxDipironAdmissao;
	}

	public void setCheckBoxDipironAdmissao(JCheckBox checkBoxDipironAdmissao) {
		this.checkBoxDipironAdmissao = checkBoxDipironAdmissao;
	}

	public JCheckBox getCheckBoxPenicilinaPrescrever() {
		return checkBoxPenicilinaPrescrever;
	}

	public void setCheckBoxPenicilinaPrescrever(JCheckBox checkBoxPenicilinaPrescrever) {
		this.checkBoxPenicilinaPrescrever = checkBoxPenicilinaPrescrever;
	}

	public JCheckBox getCheckBoxGlutenPrescrever() {
		return checkBoxGlutenPrescrever;
	}

	public void setCheckBoxGlutenPrescrever(JCheckBox checkBoxGlutenPrescrever) {
		this.checkBoxGlutenPrescrever = checkBoxGlutenPrescrever;
	}

	public JCheckBox getCheckBoxFrutosDoMarPrescrever() {
		return checkBoxFrutosDoMarPrescrever;
	}

	public void setCheckBoxFrutosDoMarPrescrever(JCheckBox checkBoxFrutosDoMarPrescrever) {
		this.checkBoxFrutosDoMarPrescrever = checkBoxFrutosDoMarPrescrever;
	}

	public JCheckBox getCheckBoxDipironaPrescrever() {
		return checkBoxDipironaPrescrever;
	}

	public void setCheckBoxDipironaPrescrever(JCheckBox checkBoxDipironaPrescrever) {
		this.checkBoxDipironaPrescrever = checkBoxDipironaPrescrever;
	}

	public JCheckBox getCheckBoxPenicilinaMedicamentos() {
		return checkBoxPenicilinaMedicamentos;
	}

	public void setCheckBoxPenicilinaMedicamentos(JCheckBox checkBoxPenicilinaMedicamentos) {
		this.checkBoxPenicilinaMedicamentos = checkBoxPenicilinaMedicamentos;
	}

	public JCheckBox getCheckBoxGlutenMedicamentos() {
		return checkBoxGlutenMedicamentos;
	}

	public void setCheckBoxGlutenMedicamentos(JCheckBox checkBoxGlutenMedicamentos) {
		this.checkBoxGlutenMedicamentos = checkBoxGlutenMedicamentos;
	}

	public JCheckBox getCheckBoxFrutosDoMarMedicamentos() {
		return checkBoxFrutosDoMarMedicamentos;
	}

	public void setCheckBoxFrutosDoMarMedicamentos(JCheckBox checkBoxFrutosDoMarMedicamentos) {
		this.checkBoxFrutosDoMarMedicamentos = checkBoxFrutosDoMarMedicamentos;
	}

	public JCheckBox getCheckBoxDipironaMedicamentos() {
		return checkBoxDipironaMedicamentos;
	}

	public void setCheckBoxDipironaMedicamentos(JCheckBox checkBoxDipironaMedicamentos) {
		this.checkBoxDipironaMedicamentos = checkBoxDipironaMedicamentos;
	}

	public JCheckBox getCheckBoxPenicilinaAlergia() {
		return checkBoxPenicilinaAlergia;
	}

	public void setCheckBoxPenicilinaAlergia(JCheckBox checkBoxPenicilinaAlergia) {
		this.checkBoxPenicilinaAlergia = checkBoxPenicilinaAlergia;
	}

	public JCheckBox getCheckBoxFrutosDoMarAlergia() {
		return checkBoxFrutosDoMarAlergia;
	}

	public void setCheckBoxFrutosDoMarAlergia(JCheckBox checkBoxFrutosDoMarAlergia) {
		this.checkBoxFrutosDoMarAlergia = checkBoxFrutosDoMarAlergia;
	}

	public JCheckBox getCheckBoxDipironaAlergia() {
		return checkBoxDipironaAlergia;
	}

	public void setCheckBoxDipironaAlergia(JCheckBox checkBoxDipironaAlergia) {
		this.checkBoxDipironaAlergia = checkBoxDipironaAlergia;
	}

	public JCheckBox getCheckBoxGlutenAlergia() {
		return checkBoxGlutenAlergia;
	}

	public void setCheckBoxGlutenAlergia(JCheckBox checkBoxGlutenAlergia) {
		this.checkBoxGlutenAlergia = checkBoxGlutenAlergia;
	}

	public JButton getBotaoSalvarAdmissao() {
		return botaoSalvarAdmissao;
	}

	public void setBotaoSalvarAdmissao(JButton botaoSalvarAdmissao) {
		this.botaoSalvarAdmissao = botaoSalvarAdmissao;
	}
	
	public JButton getBotaoCancelarAdmissao() {
		return botaoCancelarAdmissao;
	}

	public void setBotaoCancelarAdmissao(JButton botaoCancelarAdmissao) {
		this.botaoCancelarAdmissao = botaoCancelarAdmissao;
	}

	public JButton getBotaoCancelarListaInternados() {
		return botaoCancelarListaInternados;
	}

	public void setBotaoCancelarListaInternados(JButton botaoCancelarListaInternados) {
		this.botaoCancelarListaInternados = botaoCancelarListaInternados;
	}

	public JButton getBotaoCancelarAlta() {
		return botaoCancelarAlta;
	}

	public void setBotaoCancelarAlta(JButton botaoCancelarAlta) {
		this.botaoCancelarAlta = botaoCancelarAlta;
	}

	public JButton getBotaoCancelarMedicamentos() {
		return botaoCancelarMedicamentos;
	}

	public void setBotaoCancelarMedicamentos(JButton botaoCancelarMedicamentos) {
		this.botaoCancelarMedicamentos = botaoCancelarMedicamentos;
	}

	public JButton getBotaoCancelarPrescrever() {
		return botaoCancelarPrescrever;
	}

	public void setBotaoCancelarPrescrever(JButton botaoCancelarPrescrever) {
		this.botaoCancelarPrescrever = botaoCancelarPrescrever;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public void limpaTelaAdmissao() {
		fieldCpfAdmissao.setText("");
		fieldNomeAdmissao.setText("");
		fieldDataNascAdmissao.setText("");
		checkBoxGlutenAdmissao.setSelected(false);
		checkBoxDipironAdmissao.setSelected(false);
		checkBoxFrutosDoMarAdmissao.setSelected(false);
		checkBoxPenicilinaAdmissao.setSelected(false);
		comboBoxUnidade.setSelectedIndex(0);
	}

	public void limpaTelaAlta() {
		fieldCpfAlta.setText("");
		comboBoxMotivo.setSelectedIndex(0);
	}

	public void limpaTelaMedicamentos() {
		fieldCodBarrasMedicamentos.setText("");
		fieldNomeMedicamentos.setText("");
		checkBoxGlutenMedicamentos.setSelected(false);
		checkBoxDipironaMedicamentos.setSelected(false);
		checkBoxFrutosDoMarMedicamentos.setSelected(false);
		checkBoxPenicilinaMedicamentos.setSelected(false);
	}

	public void limpaTelaPrescrever() {
		fieldCpfPrescrever.setText("");
		fieldNomePrescrever.setText("");
		fieldDataNascPrescrever.setText("");
		fieldMedNormalPrescrever.setText("");
		checkBoxGlutenAlergia.setSelected(false);
		checkBoxFrutosDoMarAlergia.setSelected(false);
		checkBoxDipironaAlergia.setSelected(false);
		checkBoxPenicilinaAlergia.setSelected(false);

	}

}

