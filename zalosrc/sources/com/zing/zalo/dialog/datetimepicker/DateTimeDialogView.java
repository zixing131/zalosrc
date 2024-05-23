package com.zing.zalo.dialog.datetimepicker;

import android.R;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.TimePicker;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.dialog.datetimepicker.C8003a;
import com.zing.zalo.dialog.datetimepicker.DateTimeDialogView;
import com.zing.zalo.p077ui.widget.CustomTextSwitch;
import com.zing.zalo.zview.DialogView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import java.util.Calendar;
import java.util.Date;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import p361nb.AbstractC23647d;

/* loaded from: classes3.dex */
public class DateTimeDialogView extends DialogView implements View.OnClickListener {

    /* renamed from: H0 */
    C8003a.b f43763H0;

    /* renamed from: I0 */
    TextView f43764I0;

    /* renamed from: J0 */
    Button f43765J0;

    /* renamed from: K0 */
    Button f43766K0;

    /* renamed from: L0 */
    Date f43767L0;

    /* renamed from: M0 */
    Date f43768M0;

    /* renamed from: N0 */
    Date f43769N0;

    /* renamed from: O0 */
    boolean f43770O0;

    /* renamed from: P0 */
    boolean f43771P0;

    /* renamed from: Q0 */
    boolean f43772Q0;

    /* renamed from: S0 */
    Calendar f43774S0;

    /* renamed from: T0 */
    NumberPicker f43775T0;

    /* renamed from: U0 */
    TimePicker f43776U0;

    /* renamed from: V0 */
    CustomTextSwitch f43777V0;

    /* renamed from: W0 */
    long f43778W0;

    /* renamed from: R0 */
    boolean f43773R0 = true;

    /* renamed from: X0 */
    boolean f43779X0 = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.dialog.datetimepicker.DateTimeDialogView$a */
    /* loaded from: classes3.dex */
    public class C8001a implements CustomTextSwitch.InterfaceC13492d {
        C8001a() {
        }

        @Override // com.zing.zalo.p077ui.widget.CustomTextSwitch.InterfaceC13492d
        /* renamed from: a */
        public void mo42879a(boolean z11) {
            if (!z11) {
                AbstractC23647d.m123897g("77705001");
            } else {
                AbstractC23647d.m123897g("77705000");
            }
            DateTimeDialogView dateTimeDialogView = DateTimeDialogView.this;
            dateTimeDialogView.m43116eL(dateTimeDialogView.f43778W0);
            DateTimeDialogView.this.m43117fL();
        }

        @Override // com.zing.zalo.p077ui.widget.CustomTextSwitch.InterfaceC13492d
        /* renamed from: b */
        public void mo42880b(boolean z11) {
        }
    }

    /* renamed from: YK */
    private int m43110YK(long j11) {
        Calendar calendar = Calendar.getInstance();
        for (int i11 = 0; i11 < 365; i11++) {
            calendar.setTimeInMillis((i11 * 86400000) + j11);
            if (AbstractC23160o0.m119235a1(this.f43774S0, calendar)) {
                return i11;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZK */
    public /* synthetic */ void m43111ZK(NumberPicker numberPicker, int i11, int i12) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.f43778W0 + (i12 * 86400000));
        this.f43774S0.set(calendar.get(1), calendar.get(2), calendar.get(5));
        m43117fL();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aL */
    public /* synthetic */ void m43112aL(TimePicker timePicker, int i11, int i12) {
        this.f43774S0.set(11, i11);
        this.f43774S0.set(12, i12);
        m43117fL();
    }

    /* renamed from: bL */
    public static DateTimeDialogView m43113bL(C8003a.b bVar, Date date, Date date2, Date date3, boolean z11, boolean z12, boolean z13, boolean z14) {
        DateTimeDialogView dateTimeDialogView = new DateTimeDialogView();
        Bundle bundle = new Bundle();
        bundle.putSerializable("initialDate", date);
        bundle.putSerializable("minDate", date2);
        bundle.putSerializable("maxDate", date3);
        bundle.putBoolean("isClientSpecified24HourTime", z11);
        bundle.putBoolean("is24HourTime", z12);
        bundle.putBoolean("isLunarCalendar", z13);
        bundle.putBoolean("showTabSwitch", z14);
        dateTimeDialogView.mo60305zK(bundle);
        dateTimeDialogView.f43763H0 = bVar;
        return dateTimeDialogView;
    }

    /* renamed from: cL */
    private void m43114cL(View view) {
        int i11;
        CustomTextSwitch customTextSwitch = (CustomTextSwitch) view.findViewById(AbstractC6918a0.tabSwitch);
        this.f43777V0 = customTextSwitch;
        if (this.f43773R0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        customTextSwitch.setVisibility(i11);
        this.f43777V0.setOnCheckedChangeListener(new C8001a());
        this.f43764I0 = (TextView) view.findViewById(AbstractC6918a0.confirm_title);
        Button button = (Button) view.findViewById(AbstractC6918a0.confirm_btn_yes);
        this.f43765J0 = button;
        button.setOnClickListener(this);
        Button button2 = (Button) view.findViewById(AbstractC6918a0.confirm_btn_no);
        this.f43766K0 = button2;
        button2.setOnClickListener(this);
        this.f43775T0 = (NumberPicker) view.findViewById(AbstractC6918a0.numberPicker);
        this.f43776U0 = (TimePicker) view.findViewById(AbstractC6918a0.timePicker);
        this.f43778W0 = System.currentTimeMillis();
        this.f43779X0 = true;
        this.f43775T0.setMinValue(0);
        this.f43775T0.setMaxValue(364);
        this.f43775T0.setValue(m43110YK(this.f43778W0));
        this.f43775T0.setDescendantFocusability(393216);
        this.f43775T0.setWrapSelectorWheel(false);
        this.f43775T0.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: cn.a
            @Override // android.widget.NumberPicker.OnValueChangeListener
            public final void onValueChange(NumberPicker numberPicker, int i12, int i13) {
                DateTimeDialogView.this.m43111ZK(numberPicker, i12, i13);
            }
        });
        this.f43776U0.setDescendantFocusability(393216);
        if (this.f43771P0) {
            this.f43776U0.setIs24HourView(Boolean.valueOf(this.f43772Q0));
        } else {
            this.f43776U0.setIs24HourView(Boolean.valueOf(DateFormat.is24HourFormat(m92648SI())));
        }
        this.f43776U0.setCurrentHour(Integer.valueOf(this.f43774S0.get(11)));
        this.f43776U0.setCurrentMinute(Integer.valueOf(this.f43774S0.get(12)));
        this.f43776U0.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() { // from class: cn.b
            @Override // android.widget.TimePicker.OnTimeChangedListener
            public final void onTimeChanged(TimePicker timePicker, int i12, int i13) {
                DateTimeDialogView.this.m43112aL(timePicker, i12, i13);
            }
        });
        this.f43777V0.m75669g(this.f43770O0, true);
    }

    /* renamed from: dL */
    private void m43115dL() {
        Bundle m92642L3 = m92642L3();
        this.f43767L0 = (Date) m92642L3.getSerializable("initialDate");
        this.f43768M0 = (Date) m92642L3.getSerializable("minDate");
        this.f43769N0 = (Date) m92642L3.getSerializable("maxDate");
        this.f43771P0 = m92642L3.getBoolean("isClientSpecified24HourTime");
        this.f43772Q0 = m92642L3.getBoolean("is24HourTime");
        this.f43770O0 = m92642L3.getBoolean("isLunarCalendar");
        this.f43773R0 = m92642L3.getBoolean("showTabSwitch", true);
    }

    @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m43115dL();
        Calendar calendar = Calendar.getInstance();
        this.f43774S0 = calendar;
        calendar.setTime(this.f43767L0);
        m92601SK(1, AbstractC8915g0.Theme_Dialog_Translucent);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.cloneInContext(new ContextThemeWrapper(m92648SI(), R.style.Theme.Holo.Light)).inflate(AbstractC7409c0.layout_date_time_picker, viewGroup);
        m43114cL(inflate);
        m43117fL();
        return inflate;
    }

    /* renamed from: eL */
    void m43116eL(long j11) {
        String[] strArr = new String[365];
        Calendar calendar = Calendar.getInstance();
        for (int i11 = 0; i11 < 365; i11++) {
            calendar.setTimeInMillis((i11 * 86400000) + j11);
            if (this.f43779X0) {
                if (i11 == 0) {
                    strArr[i11] = AbstractC23136l9.m118743r0(AbstractC8020f0.str_today);
                } else if (!this.f43777V0.f69147w) {
                    strArr[i11] = AbstractC23160o0.m119195H(calendar, false, false, false, false);
                } else {
                    strArr[i11] = AbstractC23160o0.m119199J(calendar, false, false, false);
                }
            } else if (!this.f43777V0.f69147w) {
                strArr[i11] = AbstractC23160o0.m119195H(calendar, false, true, false, false);
            } else {
                strArr[i11] = AbstractC23160o0.m119199J(calendar, false, true, false);
            }
        }
        NumberPicker numberPicker = this.f43775T0;
        if (numberPicker != null) {
            numberPicker.setDisplayedValues(strArr);
        }
    }

    /* renamed from: fL */
    void m43117fL() {
        TextView textView;
        if (getContext() != null && (textView = this.f43764I0) != null) {
            if (!this.f43777V0.f69147w) {
                textView.setText(AbstractC23160o0.m119221U(this.f43774S0, this.f43772Q0, true, true, true));
            } else {
                textView.setText(AbstractC23160o0.m119203L(this.f43774S0, this.f43772Q0));
            }
            if ((this.f43768M0 != null && this.f43774S0.getTime().before(this.f43768M0)) || (this.f43769N0 != null && this.f43774S0.getTime().after(this.f43769N0))) {
                this.f43765J0.setEnabled(false);
                this.f43765J0.setAlpha(0.3f);
                TextView textView2 = this.f43764I0;
                textView2.setPaintFlags(textView2.getPaintFlags() | 16);
                return;
            }
            this.f43765J0.setEnabled(true);
            this.f43765J0.setAlpha(1.0f);
            this.f43764I0.setPaintFlags(1);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.confirm_btn_yes) {
            CustomTextSwitch customTextSwitch = this.f43777V0;
            if (customTextSwitch != null) {
                if (!customTextSwitch.f69147w) {
                    AbstractC23647d.m123897g("77705002");
                } else {
                    AbstractC23647d.m123897g("77705003");
                }
                this.f43774S0.set(13, 0);
                this.f43774S0.set(14, 0);
                C8003a.b bVar = this.f43763H0;
                if (bVar != null) {
                    bVar.mo43146a(new Date(this.f43774S0.getTimeInMillis()), this.f43777V0.f69147w);
                }
            }
            dismiss();
            return;
        }
        if (id2 == AbstractC6918a0.confirm_btn_no) {
            C8003a.b bVar2 = this.f43763H0;
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
        C8003a.b bVar = this.f43763H0;
        if (bVar != null) {
            bVar.mo43147b();
        }
    }
}
