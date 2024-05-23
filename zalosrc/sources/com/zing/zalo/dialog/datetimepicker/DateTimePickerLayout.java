package com.zing.zalo.dialog.datetimepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.TimePicker;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.dialog.datetimepicker.DateTimePickerLayout;
import java.util.Calendar;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;

/* loaded from: classes3.dex */
public class DateTimePickerLayout extends LinearLayout {

    /* renamed from: p */
    Context f43781p;

    /* renamed from: q */
    View f43782q;

    /* renamed from: r */
    NumberPicker f43783r;

    /* renamed from: s */
    TimePicker f43784s;

    /* renamed from: t */
    boolean f43785t;

    /* renamed from: u */
    Calendar f43786u;

    /* renamed from: v */
    long f43787v;

    /* renamed from: w */
    private long f43788w;

    /* renamed from: x */
    InterfaceC8002a f43789x;

    /* renamed from: com.zing.zalo.dialog.datetimepicker.DateTimePickerLayout$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC8002a {
        /* renamed from: a */
        void mo43126a(long j11);
    }

    public DateTimePickerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m43120d(NumberPicker numberPicker, int i11, int i12) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.f43788w + (i12 * 86400000));
        this.f43786u.set(calendar.get(1), calendar.get(2), calendar.get(5));
        this.f43787v = this.f43786u.getTimeInMillis();
        m43122f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m43121e(TimePicker timePicker, int i11, int i12) {
        this.f43786u.set(11, i11);
        this.f43786u.set(12, i12);
        this.f43787v = this.f43786u.getTimeInMillis();
        m43122f();
    }

    /* renamed from: f */
    private void m43122f() {
        InterfaceC8002a interfaceC8002a = this.f43789x;
        if (interfaceC8002a != null) {
            interfaceC8002a.mo43126a(this.f43787v);
        }
    }

    /* renamed from: g */
    private void m43123g() {
        View inflate = LayoutInflater.from(this.f43781p).inflate(AbstractC7409c0.date_time_picker_layout, (ViewGroup) this, true);
        this.f43782q = inflate;
        this.f43783r = (NumberPicker) inflate.findViewById(AbstractC6918a0.numberPicker);
        this.f43784s = (TimePicker) this.f43782q.findViewById(AbstractC6918a0.timePicker);
    }

    private int getSelectedValue() {
        Calendar calendar = Calendar.getInstance();
        for (int i11 = 0; i11 < 365; i11++) {
            calendar.setTimeInMillis(this.f43788w + (i11 * 86400000));
            if (AbstractC23160o0.m119235a1(this.f43786u, calendar)) {
                return i11;
            }
        }
        return 0;
    }

    /* renamed from: c */
    public void m43124c() {
        this.f43785t = true;
        this.f43784s.setIs24HourView(Boolean.TRUE);
        this.f43788w = System.currentTimeMillis();
        m43125h();
        this.f43783r.setMinValue(0);
        this.f43783r.setMaxValue(364);
        this.f43783r.setValue(0);
        this.f43783r.setDescendantFocusability(393216);
        this.f43783r.setWrapSelectorWheel(false);
        this.f43783r.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: cn.c
            @Override // android.widget.NumberPicker.OnValueChangeListener
            public final void onValueChange(NumberPicker numberPicker, int i11, int i12) {
                DateTimePickerLayout.this.m43120d(numberPicker, i11, i12);
            }
        });
        this.f43784s.setDescendantFocusability(393216);
        this.f43784s.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() { // from class: cn.d
            @Override // android.widget.TimePicker.OnTimeChangedListener
            public final void onTimeChanged(TimePicker timePicker, int i11, int i12) {
                DateTimePickerLayout.this.m43121e(timePicker, i11, i12);
            }
        });
    }

    /* renamed from: h */
    void m43125h() {
        String[] strArr = new String[365];
        Calendar calendar = Calendar.getInstance();
        for (int i11 = 0; i11 < 365; i11++) {
            calendar.setTimeInMillis(this.f43788w + (i11 * 86400000));
            if (this.f43785t) {
                if (i11 == 0) {
                    strArr[i11] = AbstractC23136l9.m118743r0(AbstractC8020f0.str_today);
                } else {
                    strArr[i11] = AbstractC23160o0.m119195H(calendar, false, false, false, false);
                }
            } else {
                strArr[i11] = AbstractC23160o0.m119195H(calendar, false, true, false, false);
            }
        }
        NumberPicker numberPicker = this.f43783r;
        if (numberPicker != null) {
            numberPicker.setDisplayedValues(strArr);
        }
    }

    public void setListener(InterfaceC8002a interfaceC8002a) {
        this.f43789x = interfaceC8002a;
    }

    public void setTime(long j11) {
        this.f43787v = j11;
        long j12 = this.f43788w;
        if (j11 < j12) {
            this.f43787v = j12;
        }
        this.f43786u.setTimeInMillis(this.f43787v);
        this.f43786u.set(14, 0);
        this.f43786u.set(13, 0);
        this.f43783r.setValue(getSelectedValue());
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.f43787v);
        this.f43784s.setCurrentHour(Integer.valueOf(calendar.get(11)));
        this.f43784s.setCurrentMinute(Integer.valueOf(calendar.get(12)));
    }

    public DateTimePickerLayout(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, 0);
    }

    public DateTimePickerLayout(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.f43785t = false;
        this.f43786u = Calendar.getInstance();
        this.f43787v = 0L;
        this.f43788w = System.currentTimeMillis();
        this.f43781p = context;
        m43123g();
    }
}
