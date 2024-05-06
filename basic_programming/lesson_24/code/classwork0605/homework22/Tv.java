package classwork0605.homework22;

public class Tv {
    private int frequency;
    private int currentChannel;

    public Tv(int frequency) {
        this.frequency = frequency;
        currentChannel = 1;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void channelForward() {
        currentChannel++;
    }

    public void channelBackward() {
        if (currentChannel > 1) {
            currentChannel--;
        }
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > 0) {
            this.currentChannel = currentChannel;
        }
    }
}
