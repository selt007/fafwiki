package com.sashantgroup.fafwiki;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.sashantgroup.fafwiki.lang.Lang;
import com.sashantgroup.fafwiki.units.General;
import com.sashantgroup.fafwiki.units.Unit;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class UnitsDraw extends AppCompatActivity {
    public static Unit unitInfo;
    public static Map loc;
    int caseLim = 40;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.draw_units);
        EditText txtSearch = findViewById(R.id.search);
        txtSearch.setVisibility(View.INVISIBLE);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        Unit[] data = MainActivity.dataUnits;
        LinearLayout linearLayout = findViewById(R.id.linearLayout);
        selectLang();

        for (final Unit attr : data) {
            General general = attr.getGeneral();
            if (general.getFactionName().toValue().toLowerCase()
                    .contains(MainActivity.fraction.toLowerCase())) {
                String name = "";
                final Button button = new Button(this);
                String id = attr.getID().toUpperCase();
                try {
                    name = Functions.attemptTranslations(id);//attr.getDescription().substring(18);
                if (id.equals("UAL0301") || id.equals("UEL0301") ||
                        id.equals("URL0301") || id.equals("XSL0301")) {
                    name = name.replace(name.substring(0, name.lastIndexOf("\"") + 2),
                            "");
                }
                } catch (Exception e) { }

//                if (name.length() > caseLim) {
//                    name = name.replace(name.substring(caseLim, caseLim + 1),
//                            name.substring(caseLim, caseLim + 1) + "\n");
//                }
                if (name == "") {
                    name = attr.getDescription().substring(18);
                }
                button.setText(name);
                button.setBackgroundColor(MainActivity.color);
                button.setTextColor(Color.parseColor("#FFFFFF"));

                icoPath(this, button, "strategic/" + attr.getStrategicIconName() + "_rest.png");

                button.setOnClickListener(v -> {
                    unitInfo = attr;
                    Intent intent = new Intent(UnitsDraw.this, UnitInfo.class);
                    startActivity(intent);
                });
                linearLayout.addView(button, ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT);
            }

            final EditText editText = findViewById(R.id.search);
            editText.setEnabled(false);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void DrawImage(Context context, Button button, String icoName) throws IOException {
        InputStream inputStream = context.getAssets().open(icoName);
        Drawable img = Drawable.createFromStream(inputStream, null);
        img.setBounds(30, 0, 90, 60);
        button.setCompoundDrawables(img, null, null, null);
    }

    public String icoPath(Context context, Button button, String nameIco) {
        String icoName = nameIco;
        try {
            DrawImage(context, button, icoName);
        }
        catch(Exception ignored) {
            try {
                DrawImage(context, button, "icons/error.png");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return icoName;
    }

    private void selectLang() {
        Lang locData = MainActivity.dataLang;
        switch (MainActivity.lang) {
            case "RU":
                loc = locData.getRu();
                break;
            case "CZ":
                loc = locData.getCz();
                break;
            case "DE":
                loc = locData.getDe();
                break;
            case "ES":
                loc = locData.getEs();
                break;
            case "FR":
                loc = locData.getFr();
                break;
            case "IT":
                loc = locData.getIt();
                break;
            case "PL":
                loc = locData.getPl();
                break;
            case "TZM":
                loc = locData.getTzm();
                break;
            default:
                loc = locData.getUs();
                break;
        }
        Functions.strLoc = loc.toString();
    }
}
