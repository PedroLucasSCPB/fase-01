package fase1.teste;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Midia> midias;

    public Catalogo() {
        this.midias = new ArrayList<>();
    }

    public void adicionarMidia(Midia m) {
        midias.add(m);
    }

    public void exibirMidias() {
        for (int i = 0; i < midias.size(); i++) {
            System.out.println((i + 1) + ". " + midias.get(i).getDescricao()  );
        }
    }

    public Midia getMidia(int index) {
        return midias.get(index);
    }

    // 👉 Getter necessário para o switch 4
    public List<Midia> getMidias() {
        return midias;
    }
}
