package ExercicioPOO3_Evento;

/*
 * Classe que representa um evento com número limitado de lugares.
 */
public class Evento {

    // Capacidade total do evento
    private int capacidadeTotal;

    // Quantidade de lugares já reservados
    private int lugaresReservados;

    /*
     * Construtor
     * Recebe a capacidade total do evento
     */
    public Evento(int capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
        this.lugaresReservados = 0; // começa sem reservas
    }

    /*
     * Retorna quantos lugares ainda estão disponíveis
     */
    public int getLugaresDisponiveis() {
        return capacidadeTotal - lugaresReservados;
    }

    /*
     * Realiza uma reserva de lugares
     */
    public boolean reservar(int quantidade) {

        // Verifica se a quantidade é válida
        if (quantidade <= 0) {
            return false;
        }

        // Verifica se há vagas suficientes
        if (quantidade <= getLugaresDisponiveis()) {
            lugaresReservados += quantidade;
            return true;
        }

        // Caso não tenha vagas suficientes
        return false;
    }

    /*
     * Cancela uma reserva
     */
    public boolean cancelar(int quantidade) {

        // Verifica se a quantidade é válida
        if (quantidade <= 0) {
            return false;
        }

        // Só pode cancelar até o número de reservas feitas
        if (quantidade <= lugaresReservados) {
            lugaresReservados -= quantidade;
            return true;
        }

        return false;
    }

    /*
     * Exibe a barra de progresso textual
     * | = lugar ocupado
     * - = lugar livre
     */
    public String gerarBarraProgresso() {
        StringBuilder barra = new StringBuilder();

        for (int i = 0; i < capacidadeTotal; i++) {
            if (i < lugaresReservados) {
                barra.append("|");
            } else {
                barra.append("-");
            }
        }

        return barra.toString();
    }

    /*
     * Retorna a mensagem de alerta conforme a ocupação
     */
    public String getMensagemStatus() {
        int disponiveis = getLugaresDisponiveis();

        if (disponiveis == 0) {
            return "⚠ O evento está LOTADO!";
        }

        double percentualDisponivel =
                (double) disponiveis / capacidadeTotal;

        if (percentualDisponivel < 0.20) {
            return "⚠ Poucas vagas restantes!";
        }

        return " Há bastante disponibilidade.";
    }

    /*
     * Exibe o status completo do evento
     */
    public void mostrarStatus() {
        System.out.println("\n--- STATUS DO EVENTO ---");
        System.out.println("Capacidade total: " + capacidadeTotal);
        System.out.println("Lugares reservados: " + lugaresReservados);
        System.out.println("Lugares disponíveis: " + getLugaresDisponiveis());
        System.out.println("Ocupação: " + gerarBarraProgresso());
        System.out.println(getMensagemStatus());
    }
}
