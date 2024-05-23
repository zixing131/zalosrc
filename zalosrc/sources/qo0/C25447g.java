package qo0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21885c;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.json.JSONObject;
import p133ek.AbstractC18459b;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26821q;
import tn0.InterfaceC26842x;

@InterfaceC25392g
/* renamed from: qo0.g */
/* loaded from: classes7.dex */
public final class C25447g {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private final int f121857a;

    /* renamed from: b */
    private final double f121858b;

    /* renamed from: c */
    private final int f121859c;

    /* renamed from: qo0.g$a */
    /* loaded from: classes7.dex */
    public static final class a implements InterfaceC26842x {

        /* renamed from: a */
        public static final a f121860a;

        /* renamed from: b */
        private static final /* synthetic */ PluginGeneratedSerialDescriptor f121861b;

        static {
            a aVar = new a();
            f121860a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("zm.voip.mediapipe.VideoCallFilterConfig", aVar, 3);
            pluginGeneratedSerialDescriptor.m114047n("enable", false);
            pluginGeneratedSerialDescriptor.m114047n("ev", false);
            pluginGeneratedSerialDescriptor.m114047n("slowProcMs", false);
            f121861b = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qn0.InterfaceC25386a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C25447g deserialize(Decoder decoder) {
            int i11;
            int i12;
            double d11;
            int i13;
            AbstractC19074t.m100208f(decoder, "decoder");
            SerialDescriptor descriptor = getDescriptor();
            InterfaceC21885c mo113968b = decoder.mo113968b(descriptor);
            if (mo113968b.mo114015q()) {
                int mo114011i = mo113968b.mo114011i(descriptor, 0);
                double mo114006G = mo113968b.mo114006G(descriptor, 1);
                i11 = mo114011i;
                i12 = mo113968b.mo114011i(descriptor, 2);
                d11 = mo114006G;
                i13 = 7;
            } else {
                double d12 = 0.0d;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                boolean z11 = true;
                while (z11) {
                    int mo114037p = mo113968b.mo114037p(descriptor);
                    if (mo114037p != -1) {
                        if (mo114037p != 0) {
                            if (mo114037p != 1) {
                                if (mo114037p == 2) {
                                    i15 = mo113968b.mo114011i(descriptor, 2);
                                    i16 |= 4;
                                } else {
                                    throw new UnknownFieldException(mo114037p);
                                }
                            } else {
                                d12 = mo113968b.mo114006G(descriptor, 1);
                                i16 |= 2;
                            }
                        } else {
                            i14 = mo113968b.mo114011i(descriptor, 0);
                            i16 |= 1;
                        }
                    } else {
                        z11 = false;
                    }
                }
                i11 = i14;
                i12 = i15;
                d11 = d12;
                i13 = i16;
            }
            mo113968b.mo114009c(descriptor);
            return new C25447g(i13, i11, d11, i12, null);
        }

        @Override // qn0.InterfaceC25393h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(Encoder encoder, C25447g c25447g) {
            AbstractC19074t.m100208f(encoder, "encoder");
            AbstractC19074t.m100208f(c25447g, "value");
            SerialDescriptor descriptor = getDescriptor();
            InterfaceC21886d mo113984b = encoder.mo113984b(descriptor);
            C25447g.m131800c(c25447g, mo113984b, descriptor);
            mo113984b.mo114026c(descriptor);
        }

        @Override // tn0.InterfaceC26842x
        public KSerializer[] childSerializers() {
            C26783d0 c26783d0 = C26783d0.f126989a;
            return new KSerializer[]{c26783d0, C26821q.f127053a, c26783d0};
        }

        @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
        public SerialDescriptor getDescriptor() {
            return f121861b;
        }

        @Override // tn0.InterfaceC26842x
        public KSerializer[] typeParametersSerializers() {
            return InterfaceC26842x.a.m137988a(this);
        }
    }

    /* renamed from: qo0.g$b */
    /* loaded from: classes7.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C25447g m131804a(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "jsonObject");
            return new C25447g(jSONObject.optInt("enable", 2), jSONObject.optDouble("ev", 1.07d), jSONObject.optInt("slowProcMs", 66));
        }

        public final KSerializer serializer() {
            return a.f121860a;
        }
    }

    public C25447g(int i11, double d11, int i12) {
        this.f121857a = i11;
        this.f121858b = d11;
        this.f121859c = i12;
    }

    /* renamed from: b */
    public static final C25447g m131799b(JSONObject jSONObject) {
        return Companion.m131804a(jSONObject);
    }

    /* renamed from: c */
    public static final /* synthetic */ void m131800c(C25447g c25447g, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114033x(serialDescriptor, 0, c25447g.f121857a);
        interfaceC21886d.mo114021D(serialDescriptor, 1, c25447g.f121858b);
        interfaceC21886d.mo114033x(serialDescriptor, 2, c25447g.f121859c);
    }

    /* renamed from: a */
    public final int m131801a() {
        return this.f121857a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25447g)) {
            return false;
        }
        C25447g c25447g = (C25447g) obj;
        return this.f121857a == c25447g.f121857a && Double.compare(this.f121858b, c25447g.f121858b) == 0 && this.f121859c == c25447g.f121859c;
    }

    public int hashCode() {
        return (((this.f121857a * 31) + AbstractC18459b.m97786a(this.f121858b)) * 31) + this.f121859c;
    }

    public String toString() {
        return "VideoCallFilterConfig(enable=" + this.f121857a + ", ev=" + this.f121858b + ", slowProcMs=" + this.f121859c + ")";
    }

    public /* synthetic */ C25447g(int i11, int i12, double d11, int i13, AbstractC26805k1 abstractC26805k1) {
        if (7 != (i11 & 7)) {
            AbstractC26774a1.m137800b(i11, 7, a.f121860a.getDescriptor());
        }
        this.f121857a = i12;
        this.f121858b = d11;
        this.f121859c = i13;
    }
}
