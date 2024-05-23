package p704z4;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractC4072b;
import com.google.android.gms.common.api.internal.AbstractC4080b;

/* renamed from: z4.t */
/* loaded from: classes2.dex */
public final class C31251t extends AbstractC31240m {

    /* renamed from: c */
    private final AbstractC4072b f144270c;

    public C31251t(AbstractC4072b abstractC4072b) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f144270c = abstractC4072b;
    }

    @Override // com.google.android.gms.common.api.AbstractC4073c
    /* renamed from: g */
    public final AbstractC4080b mo19259g(AbstractC4080b abstractC4080b) {
        return this.f144270c.m19243l(abstractC4080b);
    }

    @Override // com.google.android.gms.common.api.AbstractC4073c
    /* renamed from: j */
    public final Context mo19261j() {
        return this.f144270c.m19246o();
    }

    @Override // com.google.android.gms.common.api.AbstractC4073c
    /* renamed from: k */
    public final Looper mo19262k() {
        return this.f144270c.m19248q();
    }
}
