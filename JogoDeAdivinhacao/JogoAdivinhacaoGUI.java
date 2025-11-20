package jogo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class JogoAdivinhacaoGUI extends JFrame {

    private final JComboBox<Dificuldade> comboDificuldade;
    private final JLabel lblInfo;
    private final JLabel lblFeedback;
    private final JLabel lblTentativas;
    private final JTextField txtPalpite;
    private final JButton btnChutar;
    private final JButton btnNovoJogo;

    private final Random random = new Random();
    private int numeroSecreto;
    private int tentativasRestantes;
    private Dificuldade dificuldadeAtual;

    public JogoAdivinhacaoGUI() {
        super("Jogo de Adivinhação");

        // Layout principal
        setLayout(new BorderLayout(10, 10));

        // Painel do topo (seleção de dificuldade)
        JPanel painelTopo = new JPanel();
        painelTopo.add(new JLabel("Dificuldade:"));
        comboDificuldade = new JComboBox<>(Dificuldade.values());
        painelTopo.add(comboDificuldade);
        btnNovoJogo = new JButton("Novo Jogo");
        painelTopo.add(btnNovoJogo);
        add(painelTopo, BorderLayout.NORTH);

        // Painel central
        JPanel painelCentro = new JPanel(new GridLayout(3, 1, 5, 5));
        lblInfo = new JLabel("Clique em 'Novo Jogo' para começar.", SwingConstants.CENTER);
        lblFeedback = new JLabel("", SwingConstants.CENTER);
        lblTentativas = new JLabel("", SwingConstants.CENTER);

        painelCentro.add(lblInfo);
        painelCentro.add(lblFeedback);
        painelCentro.add(lblTentativas);

        add(painelCentro, BorderLayout.CENTER);

        // Painel inferior (entrada do palpite)
        JPanel painelBaixo = new JPanel();
        painelBaixo.add(new JLabel("Seu palpite:"));
        txtPalpite = new JTextField(8);
        painelBaixo.add(txtPalpite);
        btnChutar = new JButton("Chutar");
        painelBaixo.add(btnChutar);

        add(painelBaixo, BorderLayout.SOUTH);

        // Eventos
        btnNovoJogo.addActionListener(this::novoJogo);
        btnChutar.addActionListener(this::processarChute);

        // Configurações da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420, 230);
        setLocationRelativeTo(null);
        setResizable(false);

        bloquearJogo(true); // começa desativado
    }

    private void novoJogo(ActionEvent e) {
        dificuldadeAtual = (Dificuldade) comboDificuldade.getSelectedItem();
        if (dificuldadeAtual == null) return;

        numeroSecreto = random.nextInt(
                dificuldadeAtual.getMax() - dificuldadeAtual.getMin() + 1
        ) + dificuldadeAtual.getMin();

        tentativasRestantes = dificuldadeAtual.getTentativasMax();

        lblInfo.setText("Adivinhe um número entre " +
                dificuldadeAtual.getMin() + " e " + dificuldadeAtual.getMax());
        lblFeedback.setText("Boa sorte!");
        lblTentativas.setText("Tentativas restantes: " + tentativasRestantes);
        txtPalpite.setText("");

        bloquearJogo(false);
    }

    private void processarChute(ActionEvent e) {
        if (tentativasRestantes <= 0) {
            JOptionPane.showMessageDialog(this,
                    "Acabaram as tentativas! Clique em 'Novo Jogo' para recomeçar.");
            bloquearJogo(true);
            return;
        }

        int palpite;
        try {
            palpite = Integer.parseInt(txtPalpite.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Digite um número inteiro válido.");
            return;
        }

        tentativasRestantes--;

        if (palpite == numeroSecreto) {
            lblFeedback.setText("Acertou! O número era " + numeroSecreto);
            JOptionPane.showMessageDialog(this, "Parabéns! Você venceu!");
            bloquearJogo(true);
        } else if (palpite > numeroSecreto) {
            lblFeedback.setText("Muito alto!");
        } else {
            lblFeedback.setText("Muito baixo!");
        }

        lblTentativas.setText("Tentativas restantes: " + tentativasRestantes);

        if (tentativasRestantes <= 0 && palpite != numeroSecreto) {
            JOptionPane.showMessageDialog(this,
                    "Você perdeu! O número era " + numeroSecreto);
            bloquearJogo(true);
        }

        txtPalpite.setText("");
        txtPalpite.requestFocus();
    }

    private void bloquearJogo(boolean bloquear) {
        txtPalpite.setEnabled(!bloquear);
        btnChutar.setEnabled(!bloquear);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JogoAdivinhacaoGUI tela = new JogoAdivinhacaoGUI();
            tela.setVisible(true);
        });
    }
}
