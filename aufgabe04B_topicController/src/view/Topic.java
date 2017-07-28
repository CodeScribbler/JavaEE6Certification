package view;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Topic {

    private String title;  // Große Überschrift
    private String leftHeader;  // Beschriftung der linken Spalte
    private String rightHeader; // Beschriftung der rechten Spalte
    private Map<String, String> rows; // contentMap (der Inhalt der Tabelle)

    public Topic() {
        rows = new HashMap<>();
    }

    public Topic(String title, String leftHeader, String rightHeader) {
        this();
        this.title = title;
        this.leftHeader = leftHeader;
        this.rightHeader = rightHeader;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLeftHeader() {
        return leftHeader;
    }

    public void setLeftHeader(String leftHeader) {
        this.leftHeader = leftHeader;
    }

    public String getRightHeader() {
        return rightHeader;
    }

    public void setRightHeader(String rightHeader) {
        this.rightHeader = rightHeader;
    }

    public Set<String> keySet() {
        return rows.keySet();
    }

    public Map<String, String> getRows() {
        return rows;
    }

    public void setRows(Map<String, String> rows) {
        this.rows = rows;
    }

    public void addRow(String left, String right) {
        rows.put(left, right);
    }

    void schmirblatt() {
        Set<String> keySet = rows.keySet();
        for (String key : keySet) {
            Object value  = rows.get(key);
        }

    }
}
