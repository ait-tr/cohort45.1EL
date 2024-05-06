package classwork0605.homework22;

public class Remote {
    private int frequency;

    public Remote(int frequency) {
        this.frequency = frequency;
    }

    public int getFrequency() {
        return frequency;
    }

    public void channelForward(Tv tv) {
        if (frequency == tv.getFrequency()) {
            tv.channelForward();
        }
    }

    public void channelBackward(Tv tv) {
        if (frequency == tv.getFrequency()) {
            tv.channelBackward();
        }
    }

    public void switchChannel(Tv tv, int channelNumber) {
        if (frequency == tv.getFrequency()) {
            tv.setCurrentChannel(channelNumber);
        }
    }
}
