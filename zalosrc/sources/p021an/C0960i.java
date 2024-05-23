package p021an;

import android.text.Editable;
import com.zing.zalo.p077ui.picker.stickerpanel.EmojiShortVideoPickerView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19074t;
import fn0.C19059j0;
import gg0.AbstractC19444a;
import java.util.List;
import p328ln.InterfaceC22530a;
import p328ln.InterfaceC22531b;
import p542ub.InterfaceC27218a;
import p588vw.C28652r;

/* renamed from: an.i */
/* loaded from: classes3.dex */
public final class C0960i implements InterfaceC22531b {

    /* renamed from: a */
    public static final C0960i f3458a = new C0960i();

    private C0960i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m4502i(ZaloView zaloView) {
        if (zaloView != null) {
            zaloView.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m4503j(C17487o0 c17487o0, int i11, C19059j0 c19059j0) {
        AbstractC19074t.m100208f(c17487o0, "$this_apply");
        AbstractC19074t.m100208f(c19059j0, "$zaloView");
        c17487o0.m93058d2(i11, (ZaloView) c19059j0.f94941p, 0, "", 0, false);
    }

    @Override // p328ln.InterfaceC22531b
    /* renamed from: a */
    public void mo4504a(String str) {
        AbstractC19074t.m100208f(str, "emoticon");
        C28652r.m143349v().m143370g(str);
    }

    @Override // p328ln.InterfaceC22531b
    /* renamed from: b */
    public CharSequence mo4505b(CharSequence charSequence, float f11) {
        AbstractC19074t.m100208f(charSequence, "text");
        CharSequence m143358I = C28652r.m143349v().m143358I(charSequence.toString(), f11);
        AbstractC19074t.m100207e(m143358I, "getTextEmoticonParsed(...)");
        return m143358I;
    }

    @Override // p328ln.InterfaceC22531b
    /* renamed from: c */
    public void mo4506c(final ZaloView zaloView) {
        AbstractC19444a.m101697e(new Runnable() { // from class: an.g
            @Override // java.lang.Runnable
            public final void run() {
                C0960i.m4502i(ZaloView.this);
            }
        });
    }

    @Override // p328ln.InterfaceC22531b
    /* renamed from: d */
    public List mo4507d(int i11) {
        List m143371h = C28652r.m143349v().m143371h(i11);
        AbstractC19074t.m100207e(m143371h, "buildListSuggestionEmojiForShortVideo(...)");
        return m143371h;
    }

    @Override // p328ln.InterfaceC22531b
    /* renamed from: e */
    public boolean mo4508e(Editable editable, int i11, int i12, float f11) {
        AbstractC19074t.m100208f(editable, "editable");
        return C28652r.m143349v().m143363Y(editable, i11, i12, f11);
    }

    @Override // p328ln.InterfaceC22531b
    /* renamed from: f */
    public ZaloView mo4509f(final C17487o0 c17487o0, final int i11, InterfaceC27218a interfaceC27218a, InterfaceC22530a interfaceC22530a) {
        final C19059j0 c19059j0 = new C19059j0();
        if (c17487o0 != null) {
            c19059j0.f94941p = new EmojiShortVideoPickerView(interfaceC22530a);
            AbstractC19444a.m101697e(new Runnable() { // from class: an.h
                @Override // java.lang.Runnable
                public final void run() {
                    C0960i.m4503j(C17487o0.this, i11, c19059j0);
                }
            });
        }
        return (ZaloView) c19059j0.f94941p;
    }
}
