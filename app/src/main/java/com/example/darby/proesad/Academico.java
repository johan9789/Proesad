package com.example.darby.proesad;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by darby on 19/04/2015.
 */
public class Academico extends ActionBarActivity {


    private TextView lblMensaje;

    private Spinner plandeEstucio;
    private Spinner preRequisitos;
    private Spinner asignaturasMatriculados;
    private Spinner estadodeCuenta;
    private Spinner procesos;
    private Spinner CronogramaAcademico;
    private Spinner reglamentos;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // layout
        setContentView(R.layout.activity_academico);

        // FLECHA ... luego al manifes para dar privilegios
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);  // esto es la flecha del menu principal pascual
        // COLOR DEL MENU PRINCIPAL
        ColorDrawable colorDrawable1 = new ColorDrawable(Color.parseColor("#3E87B2"));
        actionBar.setBackgroundDrawable(colorDrawable1);

        // lista de ACADEMICO



        lblMensaje = (TextView)findViewById(R.id.LblMensaje);

        plandeEstucio = (Spinner)findViewById(R.id.Plan_de_Estudio);
        preRequisitos = (Spinner)findViewById(R.id.Pre_Requisitos);
        asignaturasMatriculados = (Spinner)findViewById(R.id.Asignaturas_Matriculados);
        estadodeCuenta = (Spinner)findViewById(R.id.Estado_de_Cuenta);
        procesos = (Spinner)findViewById(R.id.Procesos);
        CronogramaAcademico = (Spinner)findViewById(R.id.Cronograma_Academico);
        reglamentos = (Spinner)findViewById(R.id.Reglamento);


        // plan de estudio
        final String[] planEst = new String[]{"PLAN DE ESTUDIOS"};
        ArrayAdapter<String> planEstudios = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, planEst);
        planEstudios.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        plandeEstucio.setAdapter(planEstudios);
        // pre requisitos
        final String[] preReq = new String[]{"PRE_REQUISITOS"};
        ArrayAdapter<String> preRequisit= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, preReq);
        preRequisit.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        preRequisitos.setAdapter(preRequisit);

        // ASIGNACION MATICULADOS
        final String[] datos =
                new String[]{"ASIGNACION MATICULADOS","Docentes","Sílabo","Horario","Notas"};

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datos);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        asignaturasMatriculados.setAdapter(adaptador);

        asignaturasMatriculados.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(AdapterView<?> parent,
                                               android.view.View v, int position, long id) {
                        lblMensaje.setText("Seleccionado: " +
                                parent.getItemAtPosition(position));
                    }
                    public void onNothingSelected(AdapterView<?> parent) {
                        lblMensaje.setText("");
                    }
                });
        // ESTADO DE CUENTA
        final String[] estaCu = new String[]{"PRE_REQUISITOS"};
        ArrayAdapter<String> estadoCuenta = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, estaCu);
        estadoCuenta.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        estadodeCuenta.setAdapter(estadoCuenta);

        // PROCESOS
        final String[] proces =
                new String[]{"PROCESOS:","MATRICULA","EXTRA PROGRAMÁTICOS","CAMBIO DE PLAN","CONVALIDACIÓN DE ASIGNATURAS"};

        ArrayAdapter<String> adapPlanEstu = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, proces);
        adapPlanEstu.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        procesos.setAdapter(adapPlanEstu);

        // cronograma academico
        final String[] croAcad = new String[]{"PRE_REQUISITOS"};
        ArrayAdapter<String> cronograAcademic = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, croAcad);
        cronograAcademic.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        CronogramaAcademico.setAdapter(cronograAcademic);

        //Reglamentos
        final String[] regl = new String[]{"PRE_REQUISITOS"};
        ArrayAdapter<String> reglament = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, regl);
        reglament.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        reglamentos.setAdapter(reglament);

    }



    View rootview;
    @Nullable

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.activity_academico, container, false);
        return rootview;
    }
}
