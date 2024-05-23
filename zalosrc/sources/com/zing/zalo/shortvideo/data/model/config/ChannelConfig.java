package com.zing.zalo.shortvideo.data.model.config;

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
import tn0.AbstractC26805k1;
import un0.AbstractC27331i;
import un0.InterfaceC27329g;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class ChannelConfig {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final CoreConfig f50104a;

    /* renamed from: b */
    private final EditProfileConfig f50105b;

    /* renamed from: c */
    private final VideoEditConfig f50106c;

    /* renamed from: d */
    private final UpdateInfoConfig f50107d;

    /* renamed from: e */
    private final BtSheet f50108e;

    /* renamed from: f */
    private final Messages f50109f;

    /* renamed from: g */
    private final LivestreamConfig f50110g;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return ChannelConfig$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.config.ChannelConfig$a */
    /* loaded from: classes5.dex */
    public static final class C9442a implements KSerializer {

        /* renamed from: a */
        private final SerialDescriptor f50111a = ChannelConfig.Companion.serializer().getDescriptor();

        @Override // qn0.InterfaceC25386a
        /* renamed from: a */
        public ChannelConfig deserialize(Decoder decoder) {
            InterfaceC27329g interfaceC27329g;
            AbstractC19074t.m100208f(decoder, "decoder");
            if (decoder instanceof InterfaceC27329g) {
                interfaceC27329g = (InterfaceC27329g) decoder;
            } else {
                interfaceC27329g = null;
            }
            if (interfaceC27329g != null) {
                JsonObject m139916m = AbstractC27331i.m139916m(interfaceC27329g.mo139898g());
                return new ChannelConfig(CoreConfig.Companion.m51462a(AbstractC9465b.m51733n(m139916m, "coreConfig")), EditProfileConfig.Companion.m51468a(AbstractC9465b.m51733n(m139916m, "profileEditConfig")), VideoEditConfig.Companion.m51517a(AbstractC9465b.m51733n(m139916m, "videoEditConfig")), UpdateInfoConfig.Companion.m51498a(AbstractC9465b.m51733n(m139916m, "updateInfo")), BtSheet.Companion.m51422a(AbstractC9465b.m51733n(m139916m, "btSheet")), Messages.Companion.m51479a(AbstractC9465b.m51733n(m139916m, "messages")), LivestreamConfig.Companion.m51474a(AbstractC9465b.m51733n(m139916m, "livestream")));
            }
            throw new IllegalStateException("Can be deserialized only by JSON".toString());
        }

        @Override // qn0.InterfaceC25393h
        /* renamed from: b */
        public void serialize(Encoder encoder, ChannelConfig channelConfig) {
            AbstractC19074t.m100208f(encoder, "encoder");
            AbstractC19074t.m100208f(channelConfig, "value");
            throw new IllegalStateException("Serialization is not supported".toString());
        }

        @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
        public SerialDescriptor getDescriptor() {
            return this.f50111a;
        }
    }

    public /* synthetic */ ChannelConfig(int i11, CoreConfig coreConfig, EditProfileConfig editProfileConfig, VideoEditConfig videoEditConfig, UpdateInfoConfig updateInfoConfig, BtSheet btSheet, Messages messages, LivestreamConfig livestreamConfig, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f50104a = null;
        } else {
            this.f50104a = coreConfig;
        }
        if ((i11 & 2) == 0) {
            this.f50105b = null;
        } else {
            this.f50105b = editProfileConfig;
        }
        if ((i11 & 4) == 0) {
            this.f50106c = null;
        } else {
            this.f50106c = videoEditConfig;
        }
        if ((i11 & 8) == 0) {
            this.f50107d = null;
        } else {
            this.f50107d = updateInfoConfig;
        }
        if ((i11 & 16) == 0) {
            this.f50108e = null;
        } else {
            this.f50108e = btSheet;
        }
        if ((i11 & 32) == 0) {
            this.f50109f = null;
        } else {
            this.f50109f = messages;
        }
        if ((i11 & 64) == 0) {
            this.f50110g = null;
        } else {
            this.f50110g = livestreamConfig;
        }
    }

    /* renamed from: h */
    public static final /* synthetic */ void m51423h(ChannelConfig channelConfig, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || channelConfig.f50104a != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, CoreConfig$$serializer.INSTANCE, channelConfig.f50104a);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || channelConfig.f50105b != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 1, EditProfileConfig$$serializer.INSTANCE, channelConfig.f50105b);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || channelConfig.f50106c != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 2, VideoEditConfig$$serializer.INSTANCE, channelConfig.f50106c);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || channelConfig.f50107d != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 3, UpdateInfoConfig$$serializer.INSTANCE, channelConfig.f50107d);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || channelConfig.f50108e != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 4, BtSheet$$serializer.INSTANCE, channelConfig.f50108e);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || channelConfig.f50109f != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 5, Messages$$serializer.INSTANCE, channelConfig.f50109f);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 6) || channelConfig.f50110g != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 6, LivestreamConfig$$serializer.INSTANCE, channelConfig.f50110g);
        }
    }

    /* renamed from: a */
    public final BtSheet m51424a() {
        return this.f50108e;
    }

    /* renamed from: b */
    public final CoreConfig m51425b() {
        return this.f50104a;
    }

    /* renamed from: c */
    public final EditProfileConfig m51426c() {
        return this.f50105b;
    }

    /* renamed from: d */
    public final LivestreamConfig m51427d() {
        return this.f50110g;
    }

    /* renamed from: e */
    public final Messages m51428e() {
        return this.f50109f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelConfig)) {
            return false;
        }
        ChannelConfig channelConfig = (ChannelConfig) obj;
        return AbstractC19074t.m100204b(this.f50104a, channelConfig.f50104a) && AbstractC19074t.m100204b(this.f50105b, channelConfig.f50105b) && AbstractC19074t.m100204b(this.f50106c, channelConfig.f50106c) && AbstractC19074t.m100204b(this.f50107d, channelConfig.f50107d) && AbstractC19074t.m100204b(this.f50108e, channelConfig.f50108e) && AbstractC19074t.m100204b(this.f50109f, channelConfig.f50109f) && AbstractC19074t.m100204b(this.f50110g, channelConfig.f50110g);
    }

    /* renamed from: f */
    public final UpdateInfoConfig m51429f() {
        return this.f50107d;
    }

    /* renamed from: g */
    public final VideoEditConfig m51430g() {
        return this.f50106c;
    }

    public int hashCode() {
        CoreConfig coreConfig = this.f50104a;
        int hashCode = (coreConfig == null ? 0 : coreConfig.hashCode()) * 31;
        EditProfileConfig editProfileConfig = this.f50105b;
        int hashCode2 = (hashCode + (editProfileConfig == null ? 0 : editProfileConfig.hashCode())) * 31;
        VideoEditConfig videoEditConfig = this.f50106c;
        int hashCode3 = (hashCode2 + (videoEditConfig == null ? 0 : videoEditConfig.hashCode())) * 31;
        UpdateInfoConfig updateInfoConfig = this.f50107d;
        int hashCode4 = (hashCode3 + (updateInfoConfig == null ? 0 : updateInfoConfig.hashCode())) * 31;
        BtSheet btSheet = this.f50108e;
        int hashCode5 = (hashCode4 + (btSheet == null ? 0 : btSheet.hashCode())) * 31;
        Messages messages = this.f50109f;
        int hashCode6 = (hashCode5 + (messages == null ? 0 : messages.hashCode())) * 31;
        LivestreamConfig livestreamConfig = this.f50110g;
        return hashCode6 + (livestreamConfig != null ? livestreamConfig.hashCode() : 0);
    }

    public String toString() {
        return "ChannelConfig(coreConfig=" + this.f50104a + ", editProfileConfig=" + this.f50105b + ", videoEditConfig=" + this.f50106c + ", updateInfoConfig=" + this.f50107d + ", btSheet=" + this.f50108e + ", messages=" + this.f50109f + ", livestreamConfig=" + this.f50110g + ")";
    }

    public ChannelConfig(CoreConfig coreConfig, EditProfileConfig editProfileConfig, VideoEditConfig videoEditConfig, UpdateInfoConfig updateInfoConfig, BtSheet btSheet, Messages messages, LivestreamConfig livestreamConfig) {
        this.f50104a = coreConfig;
        this.f50105b = editProfileConfig;
        this.f50106c = videoEditConfig;
        this.f50107d = updateInfoConfig;
        this.f50108e = btSheet;
        this.f50109f = messages;
        this.f50110g = livestreamConfig;
    }
}
