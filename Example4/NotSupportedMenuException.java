class NotSupportedMenuException extends Exception {
    public NotSupportedMenuException(String menuName) {
        super("NotSupportedMenuException : " + menuName);
    }
}
