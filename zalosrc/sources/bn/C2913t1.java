package bn;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import au.AbstractC2379w;
import bn.C2913t1;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import ed0.AbstractC18391a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p348mi.AbstractC23309i;

/* renamed from: bn.t1 */
/* loaded from: classes3.dex */
public class C2913t1 {

    /* renamed from: a */
    private final Context f11528a;

    /* renamed from: b */
    private d f11529b;

    /* renamed from: c */
    private String f11530c;

    /* renamed from: d */
    private String f11531d;

    /* renamed from: e */
    private String f11532e;

    /* renamed from: f */
    private boolean f11533f = false;

    /* renamed from: g */
    private String f11534g = "";

    /* renamed from: h */
    private boolean f11535h = false;

    /* renamed from: bn.t1$a */
    /* loaded from: classes3.dex */
    public static class a extends KeyEventCallbackC17462c implements View.OnClickListener, AdapterView.OnItemClickListener {

        /* renamed from: I */
        View f11536I;

        /* renamed from: J */
        TextView f11537J;

        /* renamed from: K */
        ListView f11538K;

        /* renamed from: L */
        SimpleAdapter f11539L;

        /* renamed from: M */
        View f11540M;

        /* renamed from: N */
        Button f11541N;

        /* renamed from: O */
        Button f11542O;

        /* renamed from: P */
        View f11543P;

        /* renamed from: Q */
        EditText f11544Q;

        /* renamed from: R */
        TextView f11545R;

        /* renamed from: S */
        Button f11546S;

        /* renamed from: T */
        Button f11547T;

        /* renamed from: U */
        CheckBox f11548U;

        /* renamed from: V */
        TextView f11549V;

        /* renamed from: W */
        View f11550W;

        /* renamed from: X */
        View f11551X;

        /* renamed from: Y */
        d f11552Y;

        /* renamed from: Z */
        boolean f11553Z;

        /* renamed from: a0 */
        String f11554a0;

        /* renamed from: b0 */
        boolean f11555b0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: bn.t1$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C32650a extends AbstractC18391a {
            C32650a() {
            }

            @Override // ed0.AbstractC18391a, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                a.this.f11541N.setEnabled(!TextUtils.isEmpty(editable.toString().trim()));
                if (editable.length() > 1000) {
                    a.this.f11544Q.setText(editable.toString().substring(0, 1000));
                    a.this.f11544Q.setSelection(1000);
                }
            }
        }

        protected a(Context context, d dVar, boolean z11, String str, boolean z12) {
            super(context, AbstractC8915g0.Theme_Dialog_Translucent);
            this.f11552Y = dVar;
            this.f11553Z = z11;
            this.f11554a0 = str;
            this.f11555b0 = z12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: M */
        public /* synthetic */ void m13867M(View view) {
            this.f11548U.setChecked(!r2.isChecked());
        }

        /* renamed from: N */
        void m13868N(List list) {
            m92850A(AbstractC7409c0.report_dialog_content_view);
            this.f11536I = m92864h(AbstractC6918a0.report_abuse_select_reason_layout);
            ListView listView = (ListView) m92864h(AbstractC6918a0.lv_report_reason);
            this.f11538K = listView;
            listView.setChoiceMode(1);
            this.f11548U = (CheckBox) m92864h(AbstractC6918a0.cbBlock);
            this.f11549V = (TextView) m92864h(AbstractC6918a0.tvBlockUser);
            this.f11551X = m92864h(AbstractC6918a0.layoutBlockUser);
            View m92864h = m92864h(AbstractC6918a0.lineBlockUser);
            this.f11550W = m92864h;
            if (this.f11553Z) {
                m92864h.setVisibility(0);
                this.f11551X.setVisibility(0);
                this.f11549V.setText(this.f11554a0);
                this.f11548U.setChecked(this.f11555b0);
                this.f11549V.setOnClickListener(new View.OnClickListener() { // from class: bn.s1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C2913t1.a.this.m13867M(view);
                    }
                });
            }
            TextView textView = (TextView) m92864h(AbstractC6918a0.alertTitle);
            this.f11537J = textView;
            textView.setText(AbstractC8020f0.str_report_user_title);
            SimpleAdapter simpleAdapter = new SimpleAdapter(this.f89004q, list, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
            this.f11539L = simpleAdapter;
            this.f11538K.setAdapter((ListAdapter) simpleAdapter);
            this.f11538K.setOnItemClickListener(this);
        }

        /* renamed from: O */
        void m13869O(String str, String str2, String str3) {
            m92850A(AbstractC7409c0.report_dialog_no_reason_layout);
            TextView textView = (TextView) m92864h(AbstractC6918a0.message);
            this.f11545R = textView;
            if (textView != null) {
                if (TextUtils.isEmpty(str)) {
                    str = m92865i().getString(AbstractC8020f0.str_reportabuse);
                }
                textView.setText(str);
            }
            Button button = (Button) m92864h(AbstractC6918a0.report_no_reason_btn_yes);
            this.f11546S = button;
            if (button != null) {
                if (TextUtils.isEmpty(str2)) {
                    str2 = m92865i().getString(AbstractC8020f0.str_yes);
                }
                button.setText(str2);
                this.f11546S.setOnClickListener(this);
            }
            Button button2 = (Button) m92864h(AbstractC6918a0.report_no_reason_btn_no);
            this.f11547T = button2;
            if (button2 != null) {
                button2.setOnClickListener(this);
                Button button3 = this.f11547T;
                if (TextUtils.isEmpty(str3)) {
                    str3 = m92865i().getString(AbstractC8020f0.str_no);
                }
                button3.setText(str3);
            }
        }

        /* renamed from: P */
        void m13870P() {
            if (this.f11540M == null) {
                View inflate = ((ViewStub) m92864h(AbstractC6918a0.stub_report_abuse_input_reason)).inflate();
                this.f11540M = inflate;
                this.f11544Q = (EditText) inflate.findViewById(AbstractC6918a0.editReasonReport);
                View findViewById = this.f11540M.findViewById(AbstractC6918a0.editTextHolder);
                this.f11543P = findViewById;
                findViewById.setOnClickListener(this);
                this.f11544Q.addTextChangedListener(new C32650a());
                Button button = (Button) this.f11540M.findViewById(AbstractC6918a0.confirm_btn_yes);
                this.f11541N = button;
                button.setText(AbstractC8020f0.str_report_btn_send);
                this.f11541N.setEnabled(false);
                this.f11541N.setOnClickListener(this);
                Button button2 = (Button) this.f11540M.findViewById(AbstractC6918a0.confirm_btn_no);
                this.f11542O = button2;
                button2.setText(AbstractC8020f0.str_report_btn_cancel);
                this.f11542O.setOnClickListener(this);
            }
            this.f11540M.setVisibility(0);
            this.f11536I.setVisibility(8);
            EditText editText = this.f11544Q;
            if (editText != null) {
                AbstractC2379w.m12432f(editText);
            }
        }

        @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c, com.zing.zalo.zview.dialog.InterfaceC17463d
        public void dismiss() {
            EditText editText = this.f11544Q;
            if (editText != null) {
                editText.requestFocus();
                AbstractC2379w.m12430d(this.f11544Q);
            }
            super.dismiss();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar;
            CheckBox checkBox;
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.editTextHolder) {
                this.f11543P.setVisibility(8);
                AbstractC2379w.m12432f(this.f11544Q);
                this.f11544Q.selectAll();
                return;
            }
            boolean z11 = true;
            if (id2 == AbstractC6918a0.confirm_btn_yes) {
                try {
                    dismiss();
                    String obj = this.f11544Q.getText().toString();
                    if (!TextUtils.isEmpty(obj) && (dVar = this.f11552Y) != null) {
                        if (dVar instanceof b) {
                            ((b) dVar).mo13056a(0, obj);
                            return;
                        }
                        if (dVar instanceof c) {
                            c cVar = (c) dVar;
                            if (!this.f11553Z || !this.f11548U.isChecked()) {
                                z11 = false;
                            }
                            cVar.mo13055b(0, obj, z11);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            if (id2 == AbstractC6918a0.confirm_btn_no) {
                cancel();
                return;
            }
            if (id2 == AbstractC6918a0.report_no_reason_btn_yes) {
                dismiss();
                d dVar2 = this.f11552Y;
                if (dVar2 != null) {
                    if (dVar2 instanceof b) {
                        ((b) dVar2).mo13056a(0, "");
                        return;
                    }
                    if (dVar2 instanceof c) {
                        c cVar2 = (c) dVar2;
                        if (!this.f11553Z || (checkBox = this.f11548U) == null || !checkBox.isChecked()) {
                            z11 = false;
                        }
                        cVar2.mo13055b(0, "", z11);
                        return;
                    }
                    return;
                }
                return;
            }
            if (id2 == AbstractC6918a0.report_no_reason_btn_no) {
                cancel();
            }
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i11, long j11) {
            boolean z11;
            try {
                int intValue = ((Integer) ((HashMap) this.f11539L.getItem(i11)).get("id")).intValue();
                if (intValue == AbstractC8020f0.str_report_enter_other_reason) {
                    m13870P();
                    return;
                }
                dismiss();
                d dVar = this.f11552Y;
                if (dVar != null) {
                    if (dVar instanceof b) {
                        ((b) dVar).mo13056a(intValue, "");
                        return;
                    }
                    if (dVar instanceof c) {
                        c cVar = (c) dVar;
                        if (this.f11553Z && this.f11548U.isChecked()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        cVar.mo13055b(intValue, "", z11);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: bn.t1$b */
    /* loaded from: classes3.dex */
    public interface b extends d {
        /* renamed from: a */
        void mo13056a(int i11, String str);
    }

    /* renamed from: bn.t1$c */
    /* loaded from: classes3.dex */
    public interface c extends d {
        /* renamed from: b */
        void mo13055b(int i11, String str, boolean z11);
    }

    /* renamed from: bn.t1$d */
    /* loaded from: classes3.dex */
    public interface d {
    }

    public C2913t1(Context context) {
        this.f11528a = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a m13861a() {
        JSONArray jSONArray;
        int i11;
        JSONObject jSONObject;
        JSONArray jSONArray2;
        a aVar = new a(this.f11528a, this.f11529b, this.f11533f, this.f11534g, this.f11535h);
        ArrayList arrayList = new ArrayList();
        String m122114l = AbstractC23309i.m122114l();
        JSONArray jSONArray3 = null;
        if (!TextUtils.isEmpty(m122114l) && !m122114l.equalsIgnoreCase("null")) {
            try {
                jSONObject = new JSONObject(m122114l);
                try {
                    jSONArray3 = jSONObject.optJSONArray("reason");
                    jSONArray2 = jSONObject;
                } catch (Exception e11) {
                    e = e11;
                    e.printStackTrace();
                    jSONArray2 = jSONObject;
                    jSONArray = jSONArray3;
                    jSONArray3 = jSONArray2;
                    if (jSONArray3 != null) {
                        while (i11 < jSONArray.length()) {
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("name", this.f11528a.getString(AbstractC8020f0.str_report_enter_other_reason));
                        hashMap.put("id", Integer.valueOf(AbstractC8020f0.str_report_enter_other_reason));
                        arrayList.add(hashMap);
                    }
                    if (arrayList.isEmpty()) {
                    }
                    return aVar;
                }
            } catch (Exception e12) {
                e = e12;
                jSONObject = 0;
            }
            jSONArray = jSONArray3;
            jSONArray3 = jSONArray2;
        } else {
            jSONArray = null;
        }
        if (jSONArray3 != null && jSONArray != null && jSONArray.length() > 0) {
            for (i11 = 0; i11 < jSONArray.length(); i11++) {
                try {
                    JSONObject jSONObject2 = (JSONObject) jSONArray.get(i11);
                    if (jSONObject2 != null) {
                        String optString = jSONObject2.optString("id");
                        String optString2 = jSONObject2.optString("text");
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("name", optString2);
                        hashMap2.put("id", Integer.valueOf(Integer.parseInt(optString)));
                        arrayList.add(hashMap2);
                    }
                } catch (JSONException e13) {
                    e13.printStackTrace();
                }
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("name", this.f11528a.getString(AbstractC8020f0.str_report_enter_other_reason));
            hashMap3.put("id", Integer.valueOf(AbstractC8020f0.str_report_enter_other_reason));
            arrayList.add(hashMap3);
        }
        if (arrayList.isEmpty()) {
            aVar.m13868N(arrayList);
        } else {
            aVar.m13869O(this.f11530c, this.f11531d, this.f11532e);
        }
        return aVar;
    }

    /* renamed from: b */
    public C2913t1 m13862b(String str, String str2, String str3) {
        this.f11530c = str;
        this.f11531d = str2;
        this.f11532e = str3;
        return this;
    }

    /* renamed from: c */
    public C2913t1 m13863c(boolean z11) {
        this.f11535h = z11;
        return this;
    }

    /* renamed from: d */
    public C2913t1 m13864d(boolean z11, String str) {
        this.f11533f = z11;
        this.f11534g = str;
        return this;
    }

    /* renamed from: e */
    public C2913t1 m13865e(d dVar) {
        this.f11529b = dVar;
        return this;
    }
}
