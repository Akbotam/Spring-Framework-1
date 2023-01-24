package kz.mautkazy.springcourse;

public class HipHopMusic implements Music{
    private String[] hipHopMusic = {"Kesh meni", "Zhauap ber", "Alyp ket"};
    @Override
    public String[] getSong() {
        return hipHopMusic;
    }
}
