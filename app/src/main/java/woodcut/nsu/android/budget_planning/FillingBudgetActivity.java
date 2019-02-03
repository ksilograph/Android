package woodcut.nsu.android.budget_planning;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FillingBudgetActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String[] categories = {"cat1", "cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2","cat2", "cat3"};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.budget_filling);
        ListView budgetListView = findViewById(R.id.fill_category_list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.budg_item,
                categories);
        budgetListView.setAdapter(adapter);
    }
}
