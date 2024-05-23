package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.zdesign.component.TextField;
import p338m2.InterfaceC22715a;

/* renamed from: xl.j9 */
/* loaded from: classes3.dex */
public final class C29873j9 implements InterfaceC22715a {

    /* renamed from: p */
    private final TextField f138292p;

    /* renamed from: q */
    public final TextField f138293q;

    private C29873j9(TextField textField, TextField textField2) {
        this.f138292p = textField;
        this.f138293q = textField2;
    }

    /* renamed from: a */
    public static C29873j9 m148120a(View view) {
        if (view != null) {
            TextField textField = (TextField) view;
            return new C29873j9(textField, textField);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C29873j9 m148121c(LayoutInflater layoutInflater) {
        return m148122d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C29873j9 m148122d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.prodcat_catalog_creating_modal_textfield, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148120a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public TextField getRoot() {
        return this.f138292p;
    }
}
