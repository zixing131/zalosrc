package com.zing.zalo.dialog;

import android.R;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;
import au.AbstractC2353j;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.dialog.DatePickerDialog;
import com.zing.zalo.dialog.datetimepicker.C8003a;
import com.zing.zalo.p077ui.widget.CustomTextSwitch;
import com.zing.zalo.zview.DialogView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import ge.C19415g;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Stack;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import p361nb.AbstractC23647d;

/* loaded from: classes3.dex */
public class DatePickerDialog extends DialogView implements View.OnClickListener {

    /* renamed from: H0 */
    C8003a.b f43442H0;

    /* renamed from: I0 */
    TextView f43443I0;

    /* renamed from: J0 */
    Button f43444J0;

    /* renamed from: K0 */
    Button f43445K0;

    /* renamed from: L0 */
    Date f43446L0;

    /* renamed from: M0 */
    Date f43447M0;

    /* renamed from: N0 */
    Date f43448N0;

    /* renamed from: O0 */
    boolean f43449O0;

    /* renamed from: Q0 */
    NumberPicker f43451Q0;

    /* renamed from: R0 */
    NumberPicker f43452R0;

    /* renamed from: S0 */
    NumberPicker f43453S0;

    /* renamed from: T0 */
    CustomTextSwitch f43454T0;

    /* renamed from: U0 */
    Calendar f43455U0;

    /* renamed from: W0 */
    Calendar f43457W0;

    /* renamed from: Y0 */
    Calendar f43459Y0;

    /* renamed from: P0 */
    boolean f43450P0 = true;

    /* renamed from: V0 */
    C19415g f43456V0 = new C19415g();

    /* renamed from: X0 */
    C19415g f43458X0 = new C19415g();

    /* renamed from: Z0 */
    C19415g f43460Z0 = new C19415g();

    /* renamed from: a1 */
    HashMap f43461a1 = new HashMap();

    /* renamed from: b1 */
    Calendar f43462b1 = Calendar.getInstance();

    /* renamed from: c1 */
    int f43463c1 = 5;

    /* renamed from: d1 */
    int f43464d1 = 5;

    /* renamed from: e1 */
    HashMap f43465e1 = new HashMap();

    /* renamed from: f1 */
    Calendar f43466f1 = Calendar.getInstance();

    /* renamed from: g1 */
    int f43467g1 = 2;

    /* renamed from: h1 */
    int f43468h1 = 2;

    /* renamed from: i1 */
    HashMap f43469i1 = new HashMap();

    /* renamed from: j1 */
    Calendar f43470j1 = Calendar.getInstance();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.dialog.DatePickerDialog$a */
    /* loaded from: classes3.dex */
    public class C7970a implements CustomTextSwitch.InterfaceC13492d {
        C7970a() {
        }

        @Override // com.zing.zalo.p077ui.widget.CustomTextSwitch.InterfaceC13492d
        /* renamed from: a */
        public void mo42879a(boolean z11) {
            if (!z11) {
                AbstractC23647d.m123897g("77705001");
            } else {
                AbstractC23647d.m123897g("77705000");
            }
            DatePickerDialog.this.m42876rL();
            DatePickerDialog.this.m42868cL();
            DatePickerDialog.this.m42878tL();
        }

        @Override // com.zing.zalo.p077ui.widget.CustomTextSwitch.InterfaceC13492d
        /* renamed from: b */
        public void mo42880b(boolean z11) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dL */
    public /* synthetic */ void m42859dL() {
        m42873mL();
        m42872lL();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eL */
    public /* synthetic */ void m42860eL(NumberPicker numberPicker, int i11, int i12) {
        m42869iL((C19415g) this.f43461a1.get(Integer.valueOf(i11)), (C19415g) this.f43461a1.get(Integer.valueOf(i12)));
        m42877sL(this.f43456V0, this.f43455U0);
        m42878tL();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fL */
    public /* synthetic */ void m42861fL(NumberPicker numberPicker, int i11, int i12) {
        m42870jL((C19415g) this.f43465e1.get(Integer.valueOf(i11)), (C19415g) this.f43465e1.get(Integer.valueOf(i12)));
        m42877sL(this.f43456V0, this.f43455U0);
        m42878tL();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gL */
    public /* synthetic */ void m42862gL(NumberPicker numberPicker, int i11, int i12) {
        m42871kL((C19415g) this.f43469i1.get(Integer.valueOf(i11)), (C19415g) this.f43469i1.get(Integer.valueOf(i12)));
        m42877sL(this.f43456V0, this.f43455U0);
        m42878tL();
    }

    /* renamed from: hL */
    public static DatePickerDialog m42863hL(C8003a.b bVar, Date date, Date date2, Date date3, boolean z11, boolean z12) {
        DatePickerDialog datePickerDialog = new DatePickerDialog();
        Bundle bundle = new Bundle();
        bundle.putSerializable("initialDate", date);
        bundle.putBoolean("isLunarCalendar", z11);
        bundle.putBoolean("showTabSwitch", z12);
        bundle.putSerializable("minDate", date2);
        bundle.putSerializable("maxDate", date3);
        datePickerDialog.mo60305zK(bundle);
        datePickerDialog.f43442H0 = bVar;
        return datePickerDialog;
    }

    /* renamed from: oL */
    private void m42864oL(View view) {
        int i11;
        CustomTextSwitch customTextSwitch = (CustomTextSwitch) view.findViewById(AbstractC6918a0.tabSwitch);
        this.f43454T0 = customTextSwitch;
        if (this.f43450P0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        customTextSwitch.setVisibility(i11);
        this.f43454T0.m75669g(this.f43449O0, true);
        this.f43454T0.setOnCheckedChangeListener(new C7970a());
        this.f43443I0 = (TextView) view.findViewById(AbstractC6918a0.confirm_title);
        Button button = (Button) view.findViewById(AbstractC6918a0.confirm_btn_yes);
        this.f43444J0 = button;
        button.setOnClickListener(this);
        Button button2 = (Button) view.findViewById(AbstractC6918a0.confirm_btn_no);
        this.f43445K0 = button2;
        button2.setOnClickListener(this);
        this.f43451Q0 = (NumberPicker) view.findViewById(AbstractC6918a0.dayPicker);
        this.f43452R0 = (NumberPicker) view.findViewById(AbstractC6918a0.monthPicker);
        this.f43453S0 = (NumberPicker) view.findViewById(AbstractC6918a0.yearPicker);
        this.f43451Q0.setDescendantFocusability(393216);
        this.f43451Q0.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: bn.q
            @Override // android.widget.NumberPicker.OnValueChangeListener
            public final void onValueChange(NumberPicker numberPicker, int i12, int i13) {
                DatePickerDialog.this.m42860eL(numberPicker, i12, i13);
            }
        });
        this.f43452R0.setDescendantFocusability(393216);
        this.f43452R0.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: bn.r
            @Override // android.widget.NumberPicker.OnValueChangeListener
            public final void onValueChange(NumberPicker numberPicker, int i12, int i13) {
                DatePickerDialog.this.m42861fL(numberPicker, i12, i13);
            }
        });
        this.f43453S0.setDescendantFocusability(393216);
        this.f43453S0.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: bn.s
            @Override // android.widget.NumberPicker.OnValueChangeListener
            public final void onValueChange(NumberPicker numberPicker, int i12, int i13) {
                DatePickerDialog.this.m42862gL(numberPicker, i12, i13);
            }
        });
    }

    /* renamed from: pL */
    private void m42865pL() {
        Bundle m92642L3 = m92642L3();
        this.f43446L0 = (Date) m92642L3.getSerializable("initialDate");
        this.f43447M0 = (Date) m92642L3.getSerializable("minDate");
        this.f43448N0 = (Date) m92642L3.getSerializable("maxDate");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("unpackBundle: ");
        sb2.append(this.f43448N0);
        this.f43449O0 = m92642L3.getBoolean("isLunarCalendar");
        this.f43450P0 = m92642L3.getBoolean("showTabSwitch", true);
    }

    @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m42865pL();
        m92601SK(1, AbstractC8915g0.Theme_Dialog_Translucent);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.cloneInContext(new ContextThemeWrapper(m92648SI(), R.style.Theme.Holo.Light)).inflate(AbstractC7409c0.layout_date_picker_dialog, viewGroup);
        m42864oL(inflate);
        return inflate;
    }

    /* renamed from: aL */
    void m42866aL() {
        if (this.f43456V0.m101546b(this.f43458X0) == -1) {
            this.f43456V0 = this.f43458X0.clone();
        }
        if (this.f43456V0.m101546b(this.f43460Z0) == 1) {
            this.f43456V0 = this.f43460Z0.clone();
        }
    }

    /* renamed from: bL */
    void m42867bL() {
        Calendar calendar = Calendar.getInstance();
        this.f43457W0 = calendar;
        calendar.setTimeInMillis(0L);
        if (this.f43447M0 != null) {
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(this.f43447M0);
            this.f43457W0.set(1, calendar2.get(1));
            this.f43457W0.set(2, calendar2.get(2));
            this.f43457W0.set(5, calendar2.get(5));
            AbstractC23160o0.m119283q1(this.f43457W0);
        } else {
            this.f43457W0.set(1, 1900);
            AbstractC23160o0.m119289s1(this.f43457W0);
        }
        m42875qL(this.f43457W0, this.f43458X0, this.f43454T0.f69147w);
        Calendar calendar3 = (Calendar) this.f43457W0.clone();
        this.f43459Y0 = calendar3;
        if (this.f43448N0 != null) {
            Calendar calendar4 = Calendar.getInstance();
            calendar4.setTime(this.f43448N0);
            this.f43459Y0.set(1, calendar4.get(1));
            this.f43459Y0.set(2, calendar4.get(2));
            this.f43459Y0.set(5, calendar4.get(5));
            AbstractC23160o0.m119292t1(this.f43459Y0);
        } else {
            calendar3.add(1, 200);
            this.f43459Y0.add(5, -1);
        }
        m42875qL(this.f43459Y0, this.f43460Z0, this.f43454T0.f69147w);
        this.f43455U0 = Calendar.getInstance();
        if (this.f43446L0.getTime() >= this.f43457W0.getTimeInMillis() && this.f43446L0.getTime() <= this.f43459Y0.getTimeInMillis()) {
            this.f43455U0.setTime(this.f43446L0);
        } else {
            AbstractC23160o0.m119301w1(this.f43455U0);
        }
        m42875qL(this.f43455U0, this.f43456V0, this.f43454T0.f69147w);
    }

    /* renamed from: cL */
    void m42868cL() {
        m42874nL();
        m42873mL();
        m42872lL();
    }

    /* renamed from: iL */
    void m42869iL(C19415g c19415g, C19415g c19415g2) {
        if (c19415g != null && c19415g2 != null) {
            int m101547c = c19415g2.m101547c(c19415g);
            this.f43456V0.f96328a = c19415g2.f96328a;
            if (m101547c < 0) {
                m42870jL((C19415g) this.f43465e1.get(Integer.valueOf(this.f43452R0.getValue())), (C19415g) this.f43465e1.get(Integer.valueOf(this.f43452R0.getValue() - 1)));
                this.f43452R0.setValue(r2.getValue() - 1);
            } else if (m101547c > 0) {
                m42870jL((C19415g) this.f43465e1.get(Integer.valueOf(this.f43452R0.getValue())), (C19415g) this.f43465e1.get(Integer.valueOf(this.f43452R0.getValue() + 1)));
                NumberPicker numberPicker = this.f43452R0;
                numberPicker.setValue(numberPicker.getValue() + 1);
            }
            m42866aL();
        }
    }

    /* renamed from: jL */
    void m42870jL(C19415g c19415g, C19415g c19415g2) {
        if (c19415g != null && c19415g2 != null) {
            Calendar calendar = (Calendar) this.f43455U0.clone();
            int m101548d = c19415g2.m101548d(c19415g);
            if (!this.f43454T0.f69147w) {
                calendar.set(5, 1);
                calendar.set(2, c19415g2.f96329b);
                calendar.set(1, c19415g2.f96330c);
                if (this.f43456V0.f96328a > calendar.getActualMaximum(5)) {
                    this.f43456V0.f96328a = calendar.getActualMaximum(5);
                }
                this.f43456V0.f96329b = c19415g2.f96329b;
                if (m101548d < 0) {
                    m42871kL((C19415g) this.f43469i1.get(Integer.valueOf(this.f43453S0.getValue())), (C19415g) this.f43469i1.get(Integer.valueOf(this.f43453S0.getValue() - 1)));
                    NumberPicker numberPicker = this.f43453S0;
                    numberPicker.setValue(numberPicker.getValue() - 1);
                } else if (m101548d > 0) {
                    m42871kL((C19415g) this.f43469i1.get(Integer.valueOf(this.f43453S0.getValue())), (C19415g) this.f43469i1.get(Integer.valueOf(this.f43453S0.getValue() + 1)));
                    NumberPicker numberPicker2 = this.f43453S0;
                    numberPicker2.setValue(numberPicker2.getValue() + 1);
                }
            } else {
                C19415g c19415g3 = this.f43456V0;
                c19415g3.f96329b = c19415g2.f96329b;
                c19415g3.f96332e = c19415g2.f96332e;
                int i11 = c19415g3.f96328a;
                int i12 = c19415g2.f96328a;
                if (i11 > i12) {
                    c19415g3.f96328a = i12;
                }
                if (m101548d < 0) {
                    m42871kL((C19415g) this.f43469i1.get(Integer.valueOf(this.f43453S0.getValue())), (C19415g) this.f43469i1.get(Integer.valueOf(this.f43453S0.getValue() - 1)));
                    NumberPicker numberPicker3 = this.f43453S0;
                    numberPicker3.setValue(numberPicker3.getValue() - 1);
                } else if (m101548d > 0) {
                    m42871kL((C19415g) this.f43469i1.get(Integer.valueOf(this.f43453S0.getValue())), (C19415g) this.f43469i1.get(Integer.valueOf(this.f43453S0.getValue() + 1)));
                    NumberPicker numberPicker4 = this.f43453S0;
                    numberPicker4.setValue(numberPicker4.getValue() + 1);
                }
            }
            m42866aL();
            AbstractC19444a.m101695c(new Runnable() { // from class: com.zing.zalo.dialog.a
                @Override // java.lang.Runnable
                public final void run() {
                    DatePickerDialog.this.m42872lL();
                }
            });
        }
    }

    /* renamed from: kL */
    void m42871kL(C19415g c19415g, C19415g c19415g2) {
        if (c19415g2 != null && c19415g != null) {
            if (!this.f43454T0.f69147w) {
                C19415g c19415g3 = this.f43456V0;
                c19415g3.f96330c = c19415g2.f96330c;
                if (c19415g3.f96329b == 1 && c19415g3.f96328a == 29) {
                    c19415g3.f96328a = 28;
                }
            } else {
                C19415g c19415g4 = this.f43456V0;
                c19415g4.f96330c = c19415g2.f96330c;
                c19415g4.f96332e = false;
            }
            m42866aL();
            AbstractC19444a.m101695c(new Runnable() { // from class: bn.t
                @Override // java.lang.Runnable
                public final void run() {
                    DatePickerDialog.this.m42859dL();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lL */
    public void m42872lL() {
        boolean z11;
        boolean z12;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z13;
        boolean z14;
        int i15;
        try {
            if (this.f43451Q0 != null) {
                this.f43461a1.clear();
                ArrayList arrayList = new ArrayList();
                NumberPicker numberPicker = this.f43452R0;
                char c11 = 0;
                if (numberPicker != null) {
                    if (numberPicker.getValue() == this.f43452R0.getMinValue()) {
                        this.f43463c1 = 0;
                    } else {
                        this.f43463c1 = 5;
                    }
                    if (this.f43452R0.getValue() == this.f43452R0.getMaxValue()) {
                        this.f43464d1 = 0;
                    } else {
                        this.f43464d1 = 5;
                    }
                }
                if (!this.f43454T0.f69147w) {
                    this.f43462b1.setTimeInMillis(this.f43455U0.getTimeInMillis());
                    if (this.f43463c1 > 0) {
                        this.f43462b1.set(5, 1);
                        this.f43462b1.add(5, -this.f43463c1);
                    } else {
                        this.f43462b1.set(5, this.f43457W0.get(5));
                        this.f43463c1 = -(this.f43462b1.get(5) - 1);
                    }
                    if (this.f43464d1 > 0) {
                        i15 = this.f43455U0.getActualMaximum(5);
                    } else {
                        i15 = this.f43459Y0.get(5);
                    }
                    int i16 = 0;
                    i14 = 0;
                    while (i16 < this.f43463c1 + i15 + this.f43464d1) {
                        Object[] objArr = new Object[1];
                        objArr[c11] = Integer.valueOf(this.f43462b1.get(5));
                        arrayList.add(String.format("%02d", objArr));
                        this.f43461a1.put(Integer.valueOf(i16), new C19415g(this.f43462b1.get(5), this.f43462b1.get(2), this.f43462b1.get(1), false, false));
                        if (AbstractC23160o0.m119235a1(this.f43462b1, this.f43455U0)) {
                            i14 = i16;
                        }
                        i16++;
                        this.f43462b1.add(5, 1);
                        c11 = 0;
                    }
                } else {
                    C19415g c19415g = this.f43456V0;
                    int i17 = c19415g.f96328a;
                    int i18 = c19415g.f96329b;
                    int i19 = c19415g.f96330c;
                    boolean z15 = c19415g.f96332e;
                    int i21 = this.f43463c1;
                    if (i21 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (this.f43464d1 == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (i21 > 0) {
                        this.f43462b1.setTimeInMillis(this.f43455U0.getTimeInMillis());
                        this.f43462b1.add(5, -i17);
                        i11 = i17;
                        int[] m12344g = AbstractC2353j.m12344g(this.f43462b1.get(5), this.f43462b1.get(2) + 1, this.f43462b1.get(1), 7.0d);
                        int i22 = m12344g[0];
                        int i23 = m12344g[1] - 1;
                        int i24 = m12344g[2];
                        if (m12344g[3] != 0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        for (int i25 = (i22 - this.f43463c1) + 1; i25 <= i22; i25++) {
                            this.f43461a1.put(Integer.valueOf(arrayList.size()), new C19415g(i25, i23, i24, true, z14));
                            arrayList.add(String.format("%02d", Integer.valueOf(i25)));
                        }
                    } else {
                        i11 = i17;
                    }
                    if (z11) {
                        i12 = this.f43458X0.f96328a;
                    } else {
                        i12 = 1;
                    }
                    int m119294u0 = AbstractC23160o0.m119294u0(i18, i19, true, z15);
                    if (z12) {
                        i13 = this.f43460Z0.f96328a;
                    } else {
                        i13 = m119294u0;
                    }
                    i14 = 0;
                    while (i12 <= i13) {
                        int i26 = i11;
                        if (i12 == i26) {
                            i14 = arrayList.size();
                        }
                        this.f43461a1.put(Integer.valueOf(arrayList.size()), new C19415g(i12, i18, i19, true, z15));
                        arrayList.add(String.format("%02d", Integer.valueOf(i12)));
                        i12++;
                        i18 = i18;
                        i14 = i14;
                        i13 = i13;
                        i11 = i26;
                    }
                    int i27 = i18;
                    int i28 = i11;
                    if (this.f43464d1 > 0) {
                        if (m119294u0 == 0) {
                            m119294u0 = AbstractC23160o0.m119294u0(i27, i19, true, z15);
                        }
                        this.f43462b1.setTimeInMillis(this.f43455U0.getTimeInMillis());
                        this.f43462b1.add(5, (m119294u0 - i28) + 1);
                        int[] m12344g2 = AbstractC2353j.m12344g(this.f43462b1.get(5), this.f43462b1.get(2) + 1, this.f43462b1.get(1), 7.0d);
                        int i29 = m12344g2[1] - 1;
                        int i31 = m12344g2[2];
                        if (m12344g2[3] != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        int i32 = 1;
                        while (i32 <= this.f43464d1) {
                            this.f43461a1.put(Integer.valueOf(arrayList.size()), new C19415g(i32, i29, i31, true, z13));
                            arrayList.add(String.format("%02d", Integer.valueOf(i32)));
                            i32++;
                            i31 = i31;
                        }
                    }
                }
                String[] strArr = new String[arrayList.size()];
                for (int i33 = 0; i33 < arrayList.size(); i33++) {
                    strArr[i33] = (String) arrayList.get(i33);
                }
                this.f43451Q0.setDisplayedValues(null);
                this.f43451Q0.setMinValue(0);
                this.f43451Q0.setMaxValue(arrayList.size() - 1);
                this.f43451Q0.setWrapSelectorWheel(false);
                this.f43451Q0.setDisplayedValues(strArr);
                this.f43451Q0.setValue(i14);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: mL */
    void m42873mL() {
        boolean z11;
        int i11;
        boolean z12;
        int i12;
        boolean z13;
        String str;
        String str2;
        try {
            if (this.f43452R0 != null) {
                this.f43465e1.clear();
                ArrayList arrayList = new ArrayList();
                int i13 = 5;
                int i14 = 2;
                int i15 = 1;
                if (!this.f43454T0.f69147w) {
                    NumberPicker numberPicker = this.f43453S0;
                    if (numberPicker != null) {
                        if (numberPicker.getValue() == this.f43453S0.getMinValue()) {
                            this.f43467g1 = -this.f43457W0.get(2);
                        } else {
                            this.f43467g1 = 2;
                        }
                        if (this.f43453S0.getValue() == this.f43453S0.getMaxValue()) {
                            this.f43468h1 = this.f43459Y0.get(2) - 11;
                        } else {
                            this.f43468h1 = 2;
                        }
                    }
                    this.f43466f1.setTimeInMillis(this.f43455U0.getTimeInMillis());
                    this.f43466f1.set(5, 1);
                    if (this.f43453S0.getValue() == this.f43453S0.getMinValue()) {
                        this.f43466f1.set(2, this.f43457W0.get(2));
                    } else {
                        this.f43466f1.set(2, 0);
                        this.f43466f1.add(2, -this.f43467g1);
                    }
                    String[] m118755v0 = AbstractC23136l9.m118755v0(AbstractC16775v.array_months_full_02d);
                    int i16 = 0;
                    i11 = 0;
                    while (i16 < this.f43467g1 + 12 + this.f43468h1) {
                        arrayList.add(m118755v0[this.f43466f1.get(2)]);
                        this.f43465e1.put(Integer.valueOf(i16), new C19415g(this.f43466f1.getActualMaximum(i13), this.f43466f1.get(2), this.f43466f1.get(1), false, false));
                        if (AbstractC23160o0.m119238b1(this.f43466f1, this.f43455U0)) {
                            i11 = i16;
                        }
                        i16++;
                        this.f43466f1.add(2, 1);
                        i13 = 5;
                    }
                } else {
                    NumberPicker numberPicker2 = this.f43453S0;
                    if (numberPicker2 != null) {
                        if (numberPicker2.getValue() == this.f43453S0.getMinValue()) {
                            this.f43467g1 = 0;
                        } else {
                            this.f43467g1 = 2;
                        }
                        if (this.f43453S0.getValue() == this.f43453S0.getMaxValue()) {
                            this.f43468h1 = 0;
                        } else {
                            this.f43468h1 = 2;
                        }
                    }
                    String[] m118755v02 = AbstractC23136l9.m118755v0(AbstractC16775v.array_months_lunar_full);
                    C19415g c19415g = this.f43456V0;
                    int i17 = c19415g.f96328a;
                    int i18 = c19415g.f96329b;
                    int i19 = c19415g.f96330c;
                    boolean z14 = c19415g.f96332e;
                    Stack stack = new Stack();
                    this.f43466f1.setTimeInMillis(this.f43455U0.getTimeInMillis());
                    C19415g c19415g2 = new C19415g(i17, i18, i19, true, z14);
                    int m119294u0 = AbstractC23160o0.m119294u0(c19415g2.f96329b, c19415g2.f96330c, true, c19415g2.f96332e);
                    int i21 = this.f43467g1;
                    int i22 = m119294u0;
                    while (true) {
                        if ((c19415g2.f96330c == i19 || i21 > 0) && c19415g2.m101547c(this.f43458X0) != -1) {
                            if (c19415g2.f96330c < i19) {
                                i21--;
                            }
                            if (c19415g2.m101547c(this.f43460Z0) != i15) {
                                stack.push(new C19415g(i22, c19415g2.f96329b, c19415g2.f96330c, true, c19415g2.f96332e));
                            }
                            this.f43466f1.add(5, -c19415g2.f96328a);
                            int[] m12344g = AbstractC2353j.m12344g(this.f43466f1.get(5), this.f43466f1.get(i14) + i15, this.f43466f1.get(i15), 7.0d);
                            int i23 = m12344g[0];
                            c19415g2.f96328a = i23;
                            c19415g2.f96329b = m12344g[1] - 1;
                            c19415g2.f96330c = m12344g[2];
                            if (m12344g[3] != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            c19415g2.f96332e = z11;
                            i22 = i23;
                            i14 = 2;
                            i15 = 1;
                        }
                    }
                    i11 = 0;
                    while (!stack.empty()) {
                        C19415g c19415g3 = (C19415g) stack.pop();
                        if (c19415g3.m101547c(this.f43456V0) == 0) {
                            i11 = arrayList.size();
                        }
                        this.f43465e1.put(Integer.valueOf(arrayList.size()), c19415g3);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m118755v02[c19415g3.f96329b]);
                        if (!c19415g3.f96331d || !c19415g3.f96332e) {
                            str2 = "";
                        } else {
                            str2 = "+";
                        }
                        sb2.append(str2);
                        arrayList.add(sb2.toString());
                    }
                    this.f43466f1.setTimeInMillis(this.f43455U0.getTimeInMillis());
                    this.f43466f1.add(5, 31 - i17);
                    int[] m12344g2 = AbstractC2353j.m12344g(this.f43466f1.get(5), this.f43466f1.get(i14) + i15, this.f43466f1.get(i15), 7.0d);
                    c19415g2.f96328a = m12344g2[0];
                    c19415g2.f96329b = m12344g2[i15] - i15;
                    c19415g2.f96330c = m12344g2[i14];
                    if (m12344g2[3] != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    c19415g2.f96332e = z12;
                    int i24 = this.f43468h1;
                    while (true) {
                        if (c19415g2.f96330c != i19 && i24 <= 0) {
                            break;
                        }
                        this.f43466f1.add(5, 31 - c19415g2.f96328a);
                        int[] m12344g3 = AbstractC2353j.m12344g(this.f43466f1.get(5), this.f43466f1.get(i14) + i15, this.f43466f1.get(i15), 7.0d);
                        int i25 = m12344g3[0];
                        c19415g2.f96328a = i25;
                        if (i25 == i15) {
                            i12 = 30;
                        } else {
                            i12 = 29;
                        }
                        C19415g c19415g4 = new C19415g(i12, c19415g2.f96329b, c19415g2.f96330c, true, c19415g2.f96332e);
                        if (c19415g4.m101547c(this.f43460Z0) == i15) {
                            break;
                        }
                        if (c19415g2.f96330c > i19) {
                            i24--;
                        }
                        if (c19415g2.m101547c(this.f43458X0) != -1) {
                            this.f43465e1.put(Integer.valueOf(arrayList.size()), c19415g4);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(m118755v02[c19415g4.f96329b]);
                            if (!c19415g4.f96331d || !c19415g4.f96332e) {
                                str = "";
                            } else {
                                str = "+";
                            }
                            sb3.append(str);
                            arrayList.add(sb3.toString());
                        }
                        c19415g2.f96329b = m12344g3[i15] - i15;
                        c19415g2.f96330c = m12344g3[i14];
                        if (m12344g3[3] != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        c19415g2.f96332e = z13;
                    }
                }
                String[] strArr = new String[arrayList.size()];
                for (int i26 = 0; i26 < arrayList.size(); i26++) {
                    strArr[i26] = (String) arrayList.get(i26);
                }
                this.f43452R0.setDisplayedValues(null);
                this.f43452R0.setMinValue(0);
                this.f43452R0.setMaxValue(arrayList.size() - i15);
                this.f43452R0.setWrapSelectorWheel(false);
                this.f43452R0.setDisplayedValues(strArr);
                this.f43452R0.setValue(i11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: nL */
    void m42874nL() {
        int i11;
        try {
            if (this.f43453S0 != null) {
                this.f43470j1.setTimeInMillis(this.f43457W0.getTimeInMillis());
                this.f43469i1.clear();
                ArrayList arrayList = new ArrayList();
                if (!this.f43454T0.f69147w) {
                    i11 = 0;
                    while (AbstractC23160o0.m119236b(this.f43470j1, this.f43459Y0) != 1) {
                        this.f43469i1.put(Integer.valueOf(arrayList.size()), new C19415g(1, 1, this.f43470j1.get(1)));
                        if (AbstractC23160o0.m119244d1(this.f43470j1, this.f43455U0)) {
                            i11 = arrayList.size();
                        }
                        arrayList.add(this.f43470j1.get(1) + "");
                        this.f43470j1.add(1, 1);
                    }
                } else {
                    int i12 = 0;
                    for (int i13 = this.f43458X0.f96330c; i13 <= this.f43460Z0.f96330c; i13++) {
                        if (i13 == this.f43456V0.f96330c) {
                            i12 = arrayList.size();
                        }
                        this.f43469i1.put(Integer.valueOf(arrayList.size()), new C19415g(1, 1, i13));
                        arrayList.add(i13 + "");
                    }
                    i11 = i12;
                }
                String[] strArr = new String[arrayList.size()];
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    strArr[i14] = (String) arrayList.get(i14);
                }
                this.f43453S0.setDisplayedValues(null);
                this.f43453S0.setMinValue(0);
                this.f43453S0.setMaxValue(arrayList.size() - 1);
                this.f43453S0.setWrapSelectorWheel(false);
                this.f43453S0.setDisplayedValues(strArr);
                this.f43453S0.setValue(i11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.confirm_btn_yes) {
            CustomTextSwitch customTextSwitch = this.f43454T0;
            if (customTextSwitch != null) {
                if (!customTextSwitch.f69147w) {
                    AbstractC23647d.m123897g("77705002");
                } else {
                    AbstractC23647d.m123897g("77705003");
                }
                AbstractC23160o0.m119301w1(this.f43455U0);
                C8003a.b bVar = this.f43442H0;
                if (bVar != null) {
                    bVar.mo43146a(new Date(this.f43455U0.getTimeInMillis()), this.f43454T0.f69147w);
                }
            }
            dismiss();
            return;
        }
        if (id2 == AbstractC6918a0.confirm_btn_no) {
            C8003a.b bVar2 = this.f43442H0;
            if (bVar2 != null) {
                bVar2.mo43147b();
            }
            dismiss();
        }
    }

    @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.dialog.InterfaceC17463d.c
    /* renamed from: p7 */
    public void mo13013p7(InterfaceC17463d interfaceC17463d) {
        super.mo13013p7(interfaceC17463d);
        C8003a.b bVar = this.f43442H0;
        if (bVar != null) {
            bVar.mo43147b();
        }
    }

    /* renamed from: qL */
    void m42875qL(Calendar calendar, C19415g c19415g, boolean z11) {
        if (calendar != null && c19415g != null) {
            boolean z12 = false;
            if (!z11) {
                c19415g.f96331d = false;
                c19415g.f96332e = false;
                c19415g.f96328a = calendar.get(5);
                c19415g.f96329b = calendar.get(2);
                c19415g.f96330c = calendar.get(1);
                return;
            }
            c19415g.f96331d = true;
            int[] m12344g = AbstractC2353j.m12344g(calendar.get(5), calendar.get(2) + 1, calendar.get(1), 7.0d);
            c19415g.f96328a = m12344g[0];
            c19415g.f96329b = m12344g[1] - 1;
            c19415g.f96330c = m12344g[2];
            if (m12344g[3] != 0) {
                z12 = true;
            }
            c19415g.f96332e = z12;
        }
    }

    /* renamed from: rL */
    void m42876rL() {
        m42875qL(this.f43457W0, this.f43458X0, this.f43454T0.f69147w);
        m42875qL(this.f43459Y0, this.f43460Z0, this.f43454T0.f69147w);
        m42875qL(this.f43455U0, this.f43456V0, this.f43454T0.f69147w);
    }

    /* renamed from: sL */
    void m42877sL(C19415g c19415g, Calendar calendar) {
        if (calendar != null && c19415g != null) {
            if (!c19415g.f96331d) {
                calendar.set(5, c19415g.f96328a);
                calendar.set(2, c19415g.f96329b);
                calendar.set(1, c19415g.f96330c);
            } else {
                int[] m12343f = AbstractC2353j.m12343f(c19415g.f96328a, c19415g.f96329b + 1, c19415g.f96330c, c19415g.f96332e ? 1 : 0, 7.0d);
                calendar.set(5, 1);
                calendar.set(2, m12343f[1] - 1);
                calendar.set(1, m12343f[2]);
                calendar.set(5, m12343f[0]);
            }
        }
    }

    /* renamed from: tL */
    void m42878tL() {
        TextView textView;
        if (getContext() != null && (textView = this.f43443I0) != null) {
            if (!this.f43454T0.f69147w) {
                textView.setText(AbstractC23160o0.m119193G(this.f43455U0, true, true, true));
            } else {
                textView.setText(AbstractC23160o0.m119187D(this.f43455U0));
            }
            if ((this.f43447M0 != null && this.f43455U0.getTime().before(this.f43447M0)) || (this.f43448N0 != null && this.f43455U0.getTime().after(this.f43448N0))) {
                this.f43444J0.setEnabled(false);
                this.f43444J0.setAlpha(0.3f);
                TextView textView2 = this.f43443I0;
                textView2.setPaintFlags(textView2.getPaintFlags() | 16);
                return;
            }
            this.f43444J0.setEnabled(true);
            this.f43444J0.setAlpha(1.0f);
            this.f43443I0.setPaintFlags(1);
        }
    }

    @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m42867bL();
        m42868cL();
        m42878tL();
    }
}
