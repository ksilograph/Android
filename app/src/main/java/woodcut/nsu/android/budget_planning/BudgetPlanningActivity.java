package woodcut.nsu.android.budget_planning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BudgetPlanningActivity extends AppCompatActivity {

    //private Button createCategoryBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
        //createCategoryBut = findViewById(R.id.add_category_button);
    }

    public void onClickAddCategroy(View view) {
        Intent intent = new Intent(this, NameCategoryActivity.class);
        startActivity(intent);
    }

    public void onClickCreateBudget(View view) {
        Intent intent = new Intent(this, FillingBudgetActivity.class);
        startActivity(intent);
    }
}
