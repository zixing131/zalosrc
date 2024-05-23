package com.zing.zalo.shortvideo.data.model;

import android.os.Parcelable;
import fn0.AbstractC19061k0;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import mn0.InterfaceC23364b;
import qn0.C25390e;
import qn0.InterfaceC25392g;

@InterfaceC25392g
/* loaded from: classes5.dex */
public interface LoadMoreInfo extends Parcelable {
    public static final Companion Companion = Companion.f49902a;

    /* loaded from: classes5.dex */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ Companion f49902a = new Companion();

        private Companion() {
        }

        public final KSerializer serializer() {
            return new C25390e("com.zing.zalo.shortvideo.data.model.LoadMoreInfo", AbstractC19061k0.m100169b(LoadMoreInfo.class), new InterfaceC23364b[]{AbstractC19061k0.m100169b(CursorLoadMoreInfo.class), AbstractC19061k0.m100169b(PagingLoadMoreInfo.class)}, new KSerializer[]{CursorLoadMoreInfo$$serializer.INSTANCE, PagingLoadMoreInfo$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    boolean isValid();
}
