package ed0;

import android.text.InputFilter;
import android.text.Spanned;
import com.zing.zalo.utils.ToastUtils;
import fn0.AbstractC19074t;

/* renamed from: ed0.b */
/* loaded from: classes4.dex */
public final class C18392b extends InputFilter.LengthFilter {

    /* renamed from: a */
    private final CharSequence f92784a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18392b(int i11, CharSequence charSequence) {
        super(i11);
        AbstractC19074t.m100208f(charSequence, "toastMsg");
        this.f92784a = charSequence;
    }

    @Override // android.text.InputFilter.LengthFilter, android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
        int i15;
        CharSequence filter = super.filter(charSequence, i11, i12, spanned, i13, i14);
        if (filter != null) {
            i15 = filter.length();
        } else {
            i15 = 0;
        }
        if (AbstractC19074t.m100204b(filter, "") || i15 > 0) {
            ToastUtils.showMess(false, this.f92784a);
        }
        return filter;
    }
}
