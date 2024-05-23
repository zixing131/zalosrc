package vg;

import android.media.AudioManager;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.zmedia.view.InterfaceC17350c;
import java.util.HashSet;
import java.util.Set;

/* renamed from: vg.g8 */
/* loaded from: classes3.dex */
public class C28075g8 implements InterfaceC17350c {

    /* renamed from: b */
    static C28075g8 f130987b;

    /* renamed from: a */
    Set f130988a = new HashSet();

    private C28075g8() {
    }

    /* renamed from: e */
    public static C28075g8 m141538e() {
        if (f130987b == null) {
            f130987b = new C28075g8();
        }
        return f130987b;
    }

    @Override // com.zing.zalo.zmedia.view.InterfaceC17350c
    /* renamed from: a */
    public void mo92473a(Object obj) {
        this.f130988a.remove(obj);
        if (this.f130988a.isEmpty()) {
            C7853b.m40052a0().m40128g();
        }
    }

    @Override // com.zing.zalo.zmedia.view.InterfaceC17350c
    /* renamed from: b */
    public void mo92474b(Object obj) {
        this.f130988a.add(obj);
        C7853b.m40052a0().m40104Q0(3);
    }

    @Override // com.zing.zalo.zmedia.view.InterfaceC17350c
    /* renamed from: c */
    public void mo92475c(Object obj, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        this.f130988a.add(obj);
        C7853b.m40052a0().m40105R0(3, onAudioFocusChangeListener);
    }

    @Override // com.zing.zalo.zmedia.view.InterfaceC17350c
    /* renamed from: d */
    public void mo92476d(Object obj, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        this.f130988a.remove(obj);
        if (this.f130988a.isEmpty()) {
            C7853b.m40052a0().m40130h(onAudioFocusChangeListener);
        }
    }
}
