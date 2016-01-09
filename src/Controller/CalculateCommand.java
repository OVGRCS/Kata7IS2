package Controller;

import Model.Histogram;
import View.AttributeDialog;
import View.HistogramBuilder;
import View.HistogramDisplay;
import View.PopulationDialog;

public class CalculateCommand implements Command{

    public CalculateCommand(AttributeDialog attributeDialog, PopulationDialog populationDialog, HistogramDisplay display) {
        this.attributeDialog = attributeDialog;
        this.populationDialog = populationDialog;
        this.display = display;
    }
    
    private final AttributeDialog attributeDialog;
    private final PopulationDialog populationDialog;
    private final HistogramDisplay display;

    
    @Override
    public void execute() {
        Histogram histogram = new HistogramBuilder(populationDialog.population()).build(attributeDialog.attribute());
        display.show(histogram);
    }
    
}
