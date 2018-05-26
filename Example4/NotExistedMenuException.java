class NotExistedMenuException extends Exception {
    public NotExistedMenuException(String menuName) {
        super("NotExistedMenuException : " + menuName);
    }
}
