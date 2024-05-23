package com.zing.zalo.mediapipe.faceeffect.data;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import pm0.C24848g0;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;
import un0.AbstractC27323a;
import un0.AbstractC27336n;
import un0.C27326d;

@InterfaceC25392g
/* loaded from: classes4.dex */
public final class ModelMetadata {
    public static final Companion Companion = new Companion(null);

    /* renamed from: e */
    private static final AbstractC27323a f48352e = AbstractC27336n.m139941b(null, C9027a.f48357q, 1, null);

    /* renamed from: a */
    private final int f48353a;

    /* renamed from: b */
    private final String f48354b;

    /* renamed from: c */
    private final String f48355c;

    /* renamed from: d */
    private final String f48356d;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final ModelMetadata m48230a(String str) {
            AbstractC19074t.m100208f(str, "jsonString");
            try {
                AbstractC27323a abstractC27323a = ModelMetadata.f48352e;
                abstractC27323a.mo131586a();
                return (ModelMetadata) abstractC27323a.m139867d(ModelMetadata.Companion.serializer(), str);
            } catch (Exception e11) {
                e11.printStackTrace();
                return null;
            }
        }

        public final KSerializer serializer() {
            return ModelMetadata$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.mediapipe.faceeffect.data.ModelMetadata$a */
    /* loaded from: classes4.dex */
    static final class C9027a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C9027a f48357q = new C9027a();

        C9027a() {
            super(1);
        }

        /* renamed from: a */
        public final void m48231a(C27326d c27326d) {
            AbstractC19074t.m100208f(c27326d, "$this$Json");
            c27326d.m139881f(true);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m48231a((C27326d) obj);
            return C24848g0.f119245a;
        }
    }

    public /* synthetic */ ModelMetadata(int i11, int i12, String str, String str2, String str3, AbstractC26805k1 abstractC26805k1) {
        if (15 != (i11 & 15)) {
            AbstractC26774a1.m137800b(i11, 15, ModelMetadata$$serializer.INSTANCE.getDescriptor());
        }
        this.f48353a = i12;
        this.f48354b = str;
        this.f48355c = str2;
        this.f48356d = str3;
    }

    /* renamed from: g */
    public static final /* synthetic */ void m48224g(ModelMetadata modelMetadata, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114033x(serialDescriptor, 0, modelMetadata.f48353a);
        interfaceC21886d.mo114035z(serialDescriptor, 1, modelMetadata.f48354b);
        interfaceC21886d.mo114035z(serialDescriptor, 2, modelMetadata.f48355c);
        interfaceC21886d.mo114035z(serialDescriptor, 3, modelMetadata.f48356d);
    }

    /* renamed from: b */
    public final String m48225b() {
        return this.f48356d;
    }

    /* renamed from: c */
    public final String m48226c() {
        return this.f48355c;
    }

    /* renamed from: d */
    public final String m48227d() {
        return this.f48354b;
    }

    /* renamed from: e */
    public final int m48228e() {
        return this.f48353a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModelMetadata)) {
            return false;
        }
        ModelMetadata modelMetadata = (ModelMetadata) obj;
        return this.f48353a == modelMetadata.f48353a && AbstractC19074t.m100204b(this.f48354b, modelMetadata.f48354b) && AbstractC19074t.m100204b(this.f48355c, modelMetadata.f48355c) && AbstractC19074t.m100204b(this.f48356d, modelMetadata.f48356d);
    }

    /* renamed from: f */
    public final String m48229f() {
        AbstractC27323a abstractC27323a = f48352e;
        abstractC27323a.mo131586a();
        return abstractC27323a.mo131597b(Companion.serializer(), this);
    }

    public int hashCode() {
        return (((((this.f48353a * 31) + this.f48354b.hashCode()) * 31) + this.f48355c.hashCode()) * 31) + this.f48356d.hashCode();
    }

    public String toString() {
        return "ModelMetadata(version=" + this.f48353a + ", url=" + this.f48354b + ", checksumZip=" + this.f48355c + ", checksumFolder=" + this.f48356d + ")";
    }

    public ModelMetadata(int i11, String str, String str2, String str3) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str2, "checksumZip");
        AbstractC19074t.m100208f(str3, "checksumFolder");
        this.f48353a = i11;
        this.f48354b = str;
        this.f48355c = str2;
        this.f48356d = str3;
    }
}
