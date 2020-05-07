package id.ac.umn.quiz1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_list);
    seedData();
  }

  @Override
  protected void onStart() {
    super.onStart();
    seedData();
  }

  @Override
  protected void onResume() {
    super.onResume();
    seedData();
  }

  public void seedData() {
    ListView listMember = findViewById(R.id.listView);

    final ArrayList<String> list = new ArrayList<String>();

    final ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, list);
    listMember.setAdapter(adapter);

    listMember.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        //TODO Logic for Update member here
      }
    });

    listMember.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
      @Override
      public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
        //TODO Logic for Delete member here
        return true;
      }
    });
  }
}
