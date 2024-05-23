package p258j7;

import android.os.Bundle;
import com.google.android.play.core.splitinstall.SplitInstallException;
import java.util.List;
import p291k7.AbstractBinderC21526n0;
import p291k7.C21536q1;
import p342m6.C22890k;

/* renamed from: j7.w */
/* loaded from: classes3.dex */
abstract class AbstractBinderC20982w extends AbstractBinderC21526n0 {

    /* renamed from: p */
    final C22890k f102896p;

    /* renamed from: q */
    final /* synthetic */ C20984x f102897q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractBinderC20982w(C20984x c20984x, C22890k c22890k) {
        this.f102897q = c20984x;
        this.f102896p = c22890k;
    }

    @Override // p291k7.InterfaceC21529o0
    /* renamed from: A */
    public final void mo109518A(Bundle bundle) {
        C21536q1 c21536q1;
        this.f102897q.f102905b.m111152u(this.f102896p);
        int i11 = bundle.getInt("error_code");
        c21536q1 = C20984x.f102902c;
        c21536q1.m111195b("onError(%d)", Integer.valueOf(i11));
        this.f102896p.m117597d(new SplitInstallException(i11));
    }

    /* renamed from: A1 */
    public void mo109517A1(int i11, Bundle bundle) {
        C21536q1 c21536q1;
        this.f102897q.f102905b.m111152u(this.f102896p);
        c21536q1 = C20984x.f102902c;
        c21536q1.m111197d("onStartInstall(%d)", Integer.valueOf(i11));
    }

    /* renamed from: I */
    public void mo109515I(int i11, Bundle bundle) {
        C21536q1 c21536q1;
        this.f102897q.f102905b.m111152u(this.f102896p);
        c21536q1 = C20984x.f102902c;
        c21536q1.m111197d("onCancelInstall(%d)", Integer.valueOf(i11));
    }

    @Override // p291k7.InterfaceC21529o0
    /* renamed from: J */
    public void mo109519J(Bundle bundle) {
        C21536q1 c21536q1;
        this.f102897q.f102905b.m111152u(this.f102896p);
        c21536q1 = C20984x.f102902c;
        c21536q1.m111197d("onDeferredLanguageUninstall", new Object[0]);
    }

    @Override // p291k7.InterfaceC21529o0
    /* renamed from: M */
    public void mo109520M(Bundle bundle) {
        C21536q1 c21536q1;
        this.f102897q.f102905b.m111152u(this.f102896p);
        c21536q1 = C20984x.f102902c;
        c21536q1.m111197d("onDeferredInstall", new Object[0]);
    }

    @Override // p291k7.InterfaceC21529o0
    /* renamed from: V */
    public void mo109521V(List list) {
        C21536q1 c21536q1;
        this.f102897q.f102905b.m111152u(this.f102896p);
        c21536q1 = C20984x.f102902c;
        c21536q1.m111197d("onGetSessionStates", new Object[0]);
    }

    @Override // p291k7.InterfaceC21529o0
    /* renamed from: X2 */
    public void mo109522X2(Bundle bundle) {
        C21536q1 c21536q1;
        this.f102897q.f102905b.m111152u(this.f102896p);
        c21536q1 = C20984x.f102902c;
        c21536q1.m111197d("onDeferredUninstall", new Object[0]);
    }

    @Override // p291k7.InterfaceC21529o0
    /* renamed from: d2 */
    public void mo109523d2(int i11, Bundle bundle) {
        C21536q1 c21536q1;
        this.f102897q.f102905b.m111152u(this.f102896p);
        c21536q1 = C20984x.f102902c;
        c21536q1.m111197d("onGetSession(%d)", Integer.valueOf(i11));
    }

    @Override // p291k7.InterfaceC21529o0
    /* renamed from: g1 */
    public final void mo109524g1(int i11, Bundle bundle) {
        C21536q1 c21536q1;
        this.f102897q.f102905b.m111152u(this.f102896p);
        c21536q1 = C20984x.f102902c;
        c21536q1.m111197d("onCompleteInstall(%d)", Integer.valueOf(i11));
    }

    @Override // p291k7.InterfaceC21529o0
    /* renamed from: i1 */
    public final void mo109525i1(Bundle bundle) {
        C21536q1 c21536q1;
        this.f102897q.f102905b.m111152u(this.f102896p);
        c21536q1 = C20984x.f102902c;
        c21536q1.m111197d("onGetSplitsForAppUpdate", new Object[0]);
    }

    @Override // p291k7.InterfaceC21529o0
    /* renamed from: v */
    public void mo109526v(Bundle bundle) {
        C21536q1 c21536q1;
        this.f102897q.f102905b.m111152u(this.f102896p);
        c21536q1 = C20984x.f102902c;
        c21536q1.m111197d("onDeferredLanguageInstall", new Object[0]);
    }

    @Override // p291k7.InterfaceC21529o0
    public final void zzk(Bundle bundle) {
        C21536q1 c21536q1;
        this.f102897q.f102905b.m111152u(this.f102896p);
        c21536q1 = C20984x.f102902c;
        c21536q1.m111197d("onCompleteInstallForAppUpdate", new Object[0]);
    }
}
