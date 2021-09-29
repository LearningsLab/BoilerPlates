
public class HumanPlayer extends Player {
    private int user_id;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public static class Builder {
        private HumanPlayer player;

        public Builder() {
            this.player = new HumanPlayer();
        }

        public Builder withUserId(int user_id) {
            this.player.setUser_id(user_id);
            return this;
        }

        public HumanPlayer build() {
            return this.player;
        }
    }
}
