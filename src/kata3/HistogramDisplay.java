package kata3;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;



public class HistogramDisplay extends ApplicationFrame{
    public HistogramDisplay(){
        super("HISTOGRAMA");  
        setContentPane(createPanel());
        pack();
    }
    
    public void execute(){
        setVisible(true);
    }
    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel;
        
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart = ChartFactory.createBarChart("Histograma JFreeChart", 
                                    "Dominios email", 
                                    "nº de emails", 
                                    dataSet, 
                                    PlotOrientation.VERTICAL, 
                                    false, 
                                    false, 
                                    rootPaneCheckingEnabled);
        return chart;
        
    }
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(23,"","ulpgc.es");
        dataset.addValue(13,"","dis.ulpgc.es");
        dataset.addValue(56,"","gmail.com");
        dataset.addValue(5,"","hotmail.com");
        
        return dataset;
    }
}
