package com.google.android.gms.common.moduleinstall.internal;

import android.content.Context;
import com.google.android.gms.common.api.AbstractC4072b;
import com.google.android.gms.common.api.C4071a;
import com.google.android.gms.common.api.internal.AbstractC4098h;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.common.moduleinstall.internal.C4245a;
import com.google.android.gms.common.moduleinstall.internal.C4247c;
import com.google.android.gms.common.moduleinstall.internal.C4248d;
import java.util.Arrays;
import p122e5.C18203d;
import p122e5.InterfaceC18202c;
import p342m6.AbstractC22888j;
import p342m6.AbstractC22894m;
import p342m6.C22890k;
import p504s5.AbstractC26146n;
import p669y4.InterfaceC30285b;
import p704z4.InterfaceC31230h;

/* renamed from: com.google.android.gms.common.moduleinstall.internal.c */
/* loaded from: classes2.dex */
public final class C4247c extends AbstractC4072b implements InterfaceC18202c {

    /* renamed from: k */
    private static final C4071a.g f16715k;

    /* renamed from: l */
    private static final C4071a.a f16716l;

    /* renamed from: m */
    private static final C4071a f16717m;

    static {
        C4071a.g gVar = new C4071a.g();
        f16715k = gVar;
        C4246b c4246b = new C4246b();
        f16716l = c4246b;
        f16717m = new C4071a("ModuleInstall.API", c4246b, gVar);
    }

    public C4247c(Context context) {
        super(context, f16717m, C4071a.d.f16181b, AbstractC4072b.a.f16192c);
    }

    /* renamed from: w */
    static final ApiFeatureRequest m19840w(boolean z11, InterfaceC30285b... interfaceC30285bArr) {
        boolean z12;
        AbstractC4205o.m19723l(interfaceC30285bArr, "Requested APIs must not be null.");
        if (interfaceC30285bArr.length > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        AbstractC4205o.m19713b(z12, "Please provide at least one OptionalModuleApi.");
        for (InterfaceC30285b interfaceC30285b : interfaceC30285bArr) {
            AbstractC4205o.m19723l(interfaceC30285b, "Requested API must not be null.");
        }
        return ApiFeatureRequest.m19835J(Arrays.asList(interfaceC30285bArr), z11);
    }

    @Override // p122e5.InterfaceC18202c
    /* renamed from: b */
    public final AbstractC22888j mo19841b(C18203d c18203d) {
        final ApiFeatureRequest m19836t = ApiFeatureRequest.m19836t(c18203d);
        c18203d.m97008b();
        c18203d.m97009c();
        boolean m97010e = c18203d.m97010e();
        if (m19836t.m19837F().isEmpty()) {
            return AbstractC22894m.m117604f(new ModuleInstallResponse(0));
        }
        AbstractC4098h.a m19430a = AbstractC4098h.m19430a();
        m19430a.m19439d(AbstractC26146n.f124373a);
        m19430a.m19438c(m97010e);
        m19430a.m19440e(27304);
        m19430a.m19437b(new InterfaceC31230h() { // from class: f5.g
            @Override // p704z4.InterfaceC31230h
            /* renamed from: a */
            public final void mo16705a(Object obj, Object obj2) {
                C4247c c4247c = C4247c.this;
                ApiFeatureRequest apiFeatureRequest = m19836t;
                ((C4245a) ((C4248d) obj).getService()).m19839X4(new BinderC18729j(c4247c, (C22890k) obj2), apiFeatureRequest, null);
            }
        });
        return m19239h(m19430a.m19436a());
    }

    @Override // p122e5.InterfaceC18202c
    /* renamed from: c */
    public final AbstractC22888j mo19842c(InterfaceC30285b... interfaceC30285bArr) {
        final ApiFeatureRequest m19840w = m19840w(false, interfaceC30285bArr);
        if (m19840w.m19837F().isEmpty()) {
            return AbstractC22894m.m117604f(new ModuleAvailabilityResponse(true, 0));
        }
        AbstractC4098h.a m19430a = AbstractC4098h.m19430a();
        m19430a.m19439d(AbstractC26146n.f124373a);
        m19430a.m19440e(27301);
        m19430a.m19438c(false);
        m19430a.m19437b(new InterfaceC31230h() { // from class: f5.h
            @Override // p704z4.InterfaceC31230h
            /* renamed from: a */
            public final void mo16705a(Object obj, Object obj2) {
                C4247c c4247c = C4247c.this;
                ApiFeatureRequest apiFeatureRequest = m19840w;
                ((C4245a) ((C4248d) obj).getService()).m19838W4(new BinderC18728i(c4247c, (C22890k) obj2), apiFeatureRequest);
            }
        });
        return m19239h(m19430a.m19436a());
    }
}
