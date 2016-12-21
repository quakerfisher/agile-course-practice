package ru.unn.agile.Fraction.infrastructure;

import ru.unn.agile.Fraction.viewmodel.ViewModel;
import ru.unn.agile.Fraction.viewmodel.ViewModelTests;

import java.io.IOException;

public class ViewModelWithTxtLoggerTests extends ViewModelTests {
    @Override
    public void setUp() throws IOException {
        FractionLogger realLogger =
            new FractionLogger("./ViewModelWithTxtLoggerTests.log");
        super.setViewModel(new ViewModel(realLogger));
    }
}