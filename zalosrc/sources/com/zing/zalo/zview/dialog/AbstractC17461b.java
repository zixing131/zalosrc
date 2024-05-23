package com.zing.zalo.zview.dialog;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import com.zing.zalo.zview.AbstractC17468f;
import com.zing.zalo.zview.AbstractC17470g;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import java.util.Calendar;

/* renamed from: com.zing.zalo.zview.dialog.b */
/* loaded from: classes7.dex */
public abstract class AbstractC17461b extends C17460a implements InterfaceC17463d.d, DatePicker.OnDateChangedListener {

    /* renamed from: J */
    private final DatePicker f88993J;

    /* renamed from: K */
    private a f88994K;

    /* renamed from: com.zing.zalo.zview.dialog.b$a */
    /* loaded from: classes7.dex */
    public interface a {
        /* renamed from: a */
        void mo86116a(DatePicker datePicker, int i11, int i12, int i13);
    }

    public AbstractC17461b(Context context, int i11, a aVar, int i12, int i13, int i14) {
        this(context, i11, aVar, null, i12, i13, i14);
    }

    /* renamed from: M */
    static int m92844M(Context context, int i11) {
        if (i11 == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.datePickerDialogTheme, typedValue, true);
            return typedValue.resourceId;
        }
        return i11;
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        if (i11 != -2) {
            if (i11 == -1 && this.f88994K != null) {
                this.f88993J.clearFocus();
                a aVar = this.f88994K;
                DatePicker datePicker = this.f88993J;
                aVar.mo86116a(datePicker, datePicker.getYear(), this.f88993J.getMonth(), this.f88993J.getDayOfMonth());
                return;
            }
            return;
        }
        cancel();
    }

    /* renamed from: Q */
    public DatePicker m92845Q() {
        return this.f88993J;
    }

    @Override // android.widget.DatePicker.OnDateChangedListener
    public void onDateChanged(DatePicker datePicker, int i11, int i12, int i13) {
        this.f88993J.init(i11, i12, i13, this);
    }

    @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c
    /* renamed from: q */
    public void mo92846q(Bundle bundle) {
        super.mo92846q(bundle);
        this.f88993J.init(bundle.getInt("year"), bundle.getInt("month"), bundle.getInt("day"), this);
    }

    @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c
    /* renamed from: r */
    public Bundle mo92847r() {
        Bundle mo92847r = super.mo92847r();
        mo92847r.putInt("year", this.f88993J.getYear());
        mo92847r.putInt("month", this.f88993J.getMonth());
        mo92847r.putInt("day", this.f88993J.getDayOfMonth());
        return mo92847r;
    }

    private AbstractC17461b(Context context, int i11, a aVar, Calendar calendar, int i12, int i13, int i14) {
        super(context, m92844M(context, i11));
        Context m92865i = m92865i();
        View inflate = LayoutInflater.from(m92865i).inflate(AbstractC17470g.date_picker_dialog, (ViewGroup) null);
        m92829P(inflate);
        mo92827N(-1, m92865i.getString(R.string.ok), this);
        mo92827N(-2, m92865i.getString(R.string.cancel), this);
        m92828O(1);
        if (calendar != null) {
            i12 = calendar.get(1);
            i13 = calendar.get(2);
            i14 = calendar.get(5);
        }
        DatePicker datePicker = (DatePicker) inflate.findViewById(AbstractC17468f.datePicker);
        this.f88993J = datePicker;
        datePicker.init(i12, i13, i14, this);
        this.f88994K = aVar;
    }
}
