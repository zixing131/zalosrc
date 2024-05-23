package p182g7;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: g7.g */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC19265g extends AbstractBinderC19260b implements InterfaceC19266h {
    public AbstractBinderC19265g() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    @Override // p182g7.AbstractBinderC19260b
    /* renamed from: E */
    protected final boolean mo100970E(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 2) {
            Bundle bundle = (Bundle) AbstractC19261c.m100971a(parcel, Bundle.CREATOR);
            AbstractC19261c.m100972b(parcel);
            mo33380w(bundle);
            return true;
        }
        return false;
    }
}
