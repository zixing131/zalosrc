package com.zing.zalo.shortvideo.data.model;

import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.User;
import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
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
public final class UserProfileResult {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final User f50008a;

    /* renamed from: b */
    private final Channel f50009b;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return UserProfileResult$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.UserProfileResult$a */
    /* loaded from: classes5.dex */
    public static final class C9433a implements KSerializer {

        /* renamed from: a */
        private final SerialDescriptor f50010a = UserProfileResult.Companion.serializer().getDescriptor();

        @Override // qn0.InterfaceC25386a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public UserProfileResult deserialize(Decoder decoder) {
            InterfaceC27329g interfaceC27329g;
            Channel channel;
            AbstractC19074t.m100208f(decoder, "decoder");
            Channel channel2 = null;
            if (decoder instanceof InterfaceC27329g) {
                interfaceC27329g = (InterfaceC27329g) decoder;
            } else {
                interfaceC27329g = null;
            }
            if (interfaceC27329g != null) {
                JsonObject m139916m = AbstractC27331i.m139916m(interfaceC27329g.mo139898g());
                User m51255a = User.C9432b.Companion.m51255a(m139916m);
                JsonObject m51733n = AbstractC9465b.m51733n(m139916m, "channel");
                if (m51733n != null) {
                    channel = Channel.C9382b.Companion.m50798a(m51733n);
                } else {
                    channel = null;
                }
                if (channel != null && channel.m50769l().length() > 0) {
                    channel2 = channel;
                }
                return new UserProfileResult(m51255a, channel2);
            }
            throw new IllegalStateException("Can be deserialized only by JSON".toString());
        }

        @Override // qn0.InterfaceC25393h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(Encoder encoder, UserProfileResult userProfileResult) {
            AbstractC19074t.m100208f(encoder, "encoder");
            AbstractC19074t.m100208f(userProfileResult, "value");
            throw new IllegalStateException("Serialization is not supported".toString());
        }

        @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
        public SerialDescriptor getDescriptor() {
            return this.f50010a;
        }
    }

    public /* synthetic */ UserProfileResult(int i11, User user, Channel channel, AbstractC26805k1 abstractC26805k1) {
        if (3 != (i11 & 3)) {
            AbstractC26774a1.m137800b(i11, 3, UserProfileResult$$serializer.INSTANCE.getDescriptor());
        }
        this.f50008a = user;
        this.f50009b = channel;
    }

    /* renamed from: c */
    public static final /* synthetic */ void m51256c(UserProfileResult userProfileResult, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114029i(serialDescriptor, 0, User$$serializer.INSTANCE, userProfileResult.f50008a);
        interfaceC21886d.mo114028h(serialDescriptor, 1, Channel$$serializer.INSTANCE, userProfileResult.f50009b);
    }

    /* renamed from: a */
    public final Channel m51257a() {
        return this.f50009b;
    }

    /* renamed from: b */
    public final User m51258b() {
        return this.f50008a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfileResult)) {
            return false;
        }
        UserProfileResult userProfileResult = (UserProfileResult) obj;
        return AbstractC19074t.m100204b(this.f50008a, userProfileResult.f50008a) && AbstractC19074t.m100204b(this.f50009b, userProfileResult.f50009b);
    }

    public int hashCode() {
        int hashCode = this.f50008a.hashCode() * 31;
        Channel channel = this.f50009b;
        return hashCode + (channel == null ? 0 : channel.hashCode());
    }

    public String toString() {
        return "UserProfileResult(user=" + this.f50008a + ", channel=" + this.f50009b + ")";
    }

    public UserProfileResult(User user, Channel channel) {
        AbstractC19074t.m100208f(user, "user");
        this.f50008a = user;
        this.f50009b = channel;
    }
}
