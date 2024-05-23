package com.zing.zalo.shortvideo.data.remote.common;

import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.Channel$$serializer;
import com.zing.zalo.shortvideo.data.model.Footer;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.model.User;
import com.zing.zalo.shortvideo.data.model.User$$serializer;
import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.json.JsonObject;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;
import un0.AbstractC27331i;
import un0.InterfaceC27329g;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class AuthInfo {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f50177a;

    /* renamed from: b */
    private final User f50178b;

    /* renamed from: c */
    private final Channel f50179c;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return AuthInfo$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.remote.common.AuthInfo$a */
    /* loaded from: classes5.dex */
    public static final class C9445a implements KSerializer {

        /* renamed from: a */
        private final SerialDescriptor f50180a = AuthInfo.Companion.serializer().getDescriptor();

        @Override // qn0.InterfaceC25386a
        /* renamed from: a */
        public AuthInfo deserialize(Decoder decoder) {
            InterfaceC27329g interfaceC27329g;
            AbstractC19074t.m100208f(decoder, "decoder");
            Channel channel = null;
            if (decoder instanceof InterfaceC27329g) {
                interfaceC27329g = (InterfaceC27329g) decoder;
            } else {
                interfaceC27329g = null;
            }
            if (interfaceC27329g != null) {
                JsonObject m139916m = AbstractC27331i.m139916m(interfaceC27329g.mo139898g());
                String m51742w = AbstractC9465b.m51742w(m139916m, new String[]{"session"}, null, 2, null);
                User user = new User(AbstractC9465b.m51742w(m139916m, new String[]{"userId"}, null, 2, null), AbstractC9465b.m51742w(m139916m, new String[]{"encodeId"}, null, 2, null), AbstractC9465b.m51742w(m139916m, new String[]{"displayName"}, null, 2, null), AbstractC9465b.m51742w(m139916m, new String[]{"avatar"}, null, 2, null), (String) null, (String) null, (String) null, false, false, false, false, false, false, false, false, (String) null, (Boolean) null, (List) null, (Integer) null, 524272, (AbstractC19060k) null);
                Channel channel2 = new Channel(AbstractC9465b.m51742w(m139916m, new String[]{"channelId"}, null, 2, null), AbstractC9465b.m51742w(m139916m, new String[]{"channelEncodeId"}, null, 2, null), AbstractC9465b.m51742w(m139916m, new String[]{"channelName"}, null, 2, null), AbstractC9465b.m51742w(m139916m, new String[]{"channelAvatar"}, null, 2, null), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, false, false, false, false, false, false, (Boolean) null, (Long) null, (Long) null, (Long) null, (Long) null, (String) null, (Section) null, (String) null, (Footer) null, (Boolean) null, (List) null, (Boolean) null, (String) null, (List) null, (List) null, (List) null, (List) null, -16, 2047, (AbstractC19060k) null);
                if (channel2.m50769l().length() > 0) {
                    channel = channel2;
                }
                return new AuthInfo(m51742w, user, channel);
            }
            throw new IllegalStateException("Can be deserialized only by JSON".toString());
        }

        @Override // qn0.InterfaceC25393h
        /* renamed from: b */
        public void serialize(Encoder encoder, AuthInfo authInfo) {
            AbstractC19074t.m100208f(encoder, "encoder");
            AbstractC19074t.m100208f(authInfo, "value");
            throw new IllegalStateException("Serialization is not supported".toString());
        }

        @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
        public SerialDescriptor getDescriptor() {
            return this.f50180a;
        }
    }

    public /* synthetic */ AuthInfo(int i11, String str, User user, Channel channel, AbstractC26805k1 abstractC26805k1) {
        if (7 != (i11 & 7)) {
            AbstractC26774a1.m137800b(i11, 7, AuthInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.f50177a = str;
        this.f50178b = user;
        this.f50179c = channel;
    }

    /* renamed from: d */
    public static final /* synthetic */ void m51518d(AuthInfo authInfo, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114035z(serialDescriptor, 0, authInfo.f50177a);
        interfaceC21886d.mo114029i(serialDescriptor, 1, User$$serializer.INSTANCE, authInfo.f50178b);
        interfaceC21886d.mo114028h(serialDescriptor, 2, Channel$$serializer.INSTANCE, authInfo.f50179c);
    }

    /* renamed from: a */
    public final Channel m51519a() {
        return this.f50179c;
    }

    /* renamed from: b */
    public final String m51520b() {
        return this.f50177a;
    }

    /* renamed from: c */
    public final User m51521c() {
        return this.f50178b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthInfo)) {
            return false;
        }
        AuthInfo authInfo = (AuthInfo) obj;
        return AbstractC19074t.m100204b(this.f50177a, authInfo.f50177a) && AbstractC19074t.m100204b(this.f50178b, authInfo.f50178b) && AbstractC19074t.m100204b(this.f50179c, authInfo.f50179c);
    }

    public int hashCode() {
        int hashCode = ((this.f50177a.hashCode() * 31) + this.f50178b.hashCode()) * 31;
        Channel channel = this.f50179c;
        return hashCode + (channel == null ? 0 : channel.hashCode());
    }

    public String toString() {
        return "AuthInfo(session=" + this.f50177a + ", user=" + this.f50178b + ", channel=" + this.f50179c + ")";
    }

    public AuthInfo(String str, User user, Channel channel) {
        AbstractC19074t.m100208f(str, "session");
        AbstractC19074t.m100208f(user, "user");
        this.f50177a = str;
        this.f50178b = user;
        this.f50179c = channel;
    }
}
