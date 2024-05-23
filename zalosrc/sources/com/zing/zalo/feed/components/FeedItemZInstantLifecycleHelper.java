package com.zing.zalo.feed.components;

import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.InterfaceC1795t;
import androidx.lifecycle.InterfaceC1801w;
import fn0.AbstractC19074t;

/* loaded from: classes4.dex */
public final class FeedItemZInstantLifecycleHelper {

    /* renamed from: a */
    public static final FeedItemZInstantLifecycleHelper f44940a = new FeedItemZInstantLifecycleHelper();

    private FeedItemZInstantLifecycleHelper() {
    }

    /* renamed from: a */
    public static final void m44299a(final AbstractC1785o abstractC1785o, final InterfaceC8403u6 interfaceC8403u6) {
        AbstractC19074t.m100208f(abstractC1785o, "lifecycle");
        AbstractC19074t.m100208f(interfaceC8403u6, "feedItemZInstant");
        abstractC1785o.mo9335a(new InterfaceC1795t() { // from class: com.zing.zalo.feed.components.FeedItemZInstantLifecycleHelper$registerLifecycleObserver$1

            /* renamed from: com.zing.zalo.feed.components.FeedItemZInstantLifecycleHelper$registerLifecycleObserver$1$a */
            /* loaded from: classes4.dex */
            public /* synthetic */ class C8179a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f44943a;

                static {
                    int[] iArr = new int[AbstractC1785o.a.values().length];
                    try {
                        iArr[AbstractC1785o.a.ON_START.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[AbstractC1785o.a.ON_RESUME.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[AbstractC1785o.a.ON_PAUSE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[AbstractC1785o.a.ON_STOP.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[AbstractC1785o.a.ON_DESTROY.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f44943a = iArr;
                }
            }

            @Override // androidx.lifecycle.InterfaceC1795t
            /* renamed from: X6 */
            public void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
                AbstractC19074t.m100208f(interfaceC1801w, "source");
                AbstractC19074t.m100208f(aVar, "event");
                int i11 = C8179a.f44943a[aVar.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 == 5) {
                                    abstractC1785o.mo9338d(this);
                                    return;
                                }
                                return;
                            }
                            InterfaceC8403u6.this.onStop();
                            return;
                        }
                        InterfaceC8403u6.this.onPause();
                        return;
                    }
                    InterfaceC8403u6.this.onResume();
                    return;
                }
                InterfaceC8403u6.this.onStart();
            }
        });
    }
}
