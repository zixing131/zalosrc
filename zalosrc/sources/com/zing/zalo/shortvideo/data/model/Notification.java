package com.zing.zalo.shortvideo.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.User;
import com.zing.zalo.shortvideo.data.model.VideoData;
import com.zing.zalo.shortvideo.data.remote.common.UnsupportedFormatException;
import com.zing.zalo.shortvideo.data.utils.AbstractC9465b;
import com.zing.zalo.shortvideo.p072ui.model.Video;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import on0.AbstractC24341v;
import qn0.InterfaceC25392g;
import sn0.AbstractC26340g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;
import tn0.C26783d0;
import tn0.C26814n1;
import un0.AbstractC27331i;
import un0.InterfaceC27329g;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class Notification implements Parcelable {

    /* renamed from: p */
    private final String f49906p;

    /* renamed from: q */
    private final Content f49907q;

    /* renamed from: r */
    private final String f49908r;

    /* renamed from: s */
    private final int f49909s;

    /* renamed from: t */
    private final long f49910t;

    /* renamed from: u */
    private final Target f49911u;

    /* renamed from: v */
    private final Target f49912v;

    /* renamed from: w */
    private int f49913w;

    /* renamed from: x */
    private Integer f49914x;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Notification> CREATOR = new C9412a();

    /* loaded from: classes5.dex */
    public static final class CommentPayload implements Parcelable {
        public static final Parcelable.Creator<CommentPayload> CREATOR = new C9407a();

        /* renamed from: p */
        private final String f49915p;

        /* renamed from: q */
        private final String f49916q;

        /* renamed from: r */
        private Boolean f49917r;

        /* renamed from: s */
        private final String f49918s;

        /* renamed from: t */
        private final Video f49919t;

        /* renamed from: com.zing.zalo.shortvideo.data.model.Notification$CommentPayload$a */
        /* loaded from: classes5.dex */
        public static final class C9407a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CommentPayload createFromParcel(Parcel parcel) {
                Boolean valueOf;
                AbstractC19074t.m100208f(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new CommentPayload(readString, readString2, valueOf, parcel.readString(), parcel.readInt() != 0 ? Video.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CommentPayload[] newArray(int i11) {
                return new CommentPayload[i11];
            }
        }

        public CommentPayload(String str, String str2, Boolean bool, String str3, Video video) {
            AbstractC19074t.m100208f(str3, "videoId");
            this.f49915p = str;
            this.f49916q = str2;
            this.f49917r = bool;
            this.f49918s = str3;
            this.f49919t = video;
        }

        /* renamed from: a */
        public final String m51065a() {
            return this.f49915p;
        }

        /* renamed from: b */
        public final String m51066b() {
            return this.f49916q;
        }

        /* renamed from: c */
        public final Video m51067c() {
            return this.f49919t;
        }

        /* renamed from: d */
        public final String m51068d() {
            return this.f49918s;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public final Boolean m51069e() {
            return this.f49917r;
        }

        /* renamed from: f */
        public final void m51070f(Boolean bool) {
            this.f49917r = bool;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            AbstractC19074t.m100208f(parcel, "out");
            parcel.writeString(this.f49915p);
            parcel.writeString(this.f49916q);
            Boolean bool = this.f49917r;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool.booleanValue() ? 1 : 0);
            }
            parcel.writeString(this.f49918s);
            Video video = this.f49919t;
            if (video == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                video.writeToParcel(parcel, i11);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return Notification$$serializer.INSTANCE;
        }
    }

    /* loaded from: classes5.dex */
    public static final class LinkPayload implements Parcelable {
        public static final Parcelable.Creator<LinkPayload> CREATOR = new C9408a();

        /* renamed from: p */
        private final String f49920p;

        /* renamed from: com.zing.zalo.shortvideo.data.model.Notification$LinkPayload$a */
        /* loaded from: classes5.dex */
        public static final class C9408a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LinkPayload createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                return new LinkPayload(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final LinkPayload[] newArray(int i11) {
                return new LinkPayload[i11];
            }
        }

        public LinkPayload(String str) {
            this.f49920p = str;
        }

        /* renamed from: a */
        public final String m51073a() {
            return this.f49920p;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            AbstractC19074t.m100208f(parcel, "out");
            parcel.writeString(this.f49920p);
        }
    }

    @InterfaceC25392g(with = C9410b.class)
    /* loaded from: classes5.dex */
    public static final class Payload implements Parcelable {

        /* renamed from: p */
        private final int f49921p;

        /* renamed from: q */
        private final Parcelable f49922q;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Payload> CREATOR = new C9409a();

        /* loaded from: classes5.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
                this();
            }

            public final KSerializer serializer() {
                return new C9410b();
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.data.model.Notification$Payload$a */
        /* loaded from: classes5.dex */
        public static final class C9409a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Payload createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                return new Payload(parcel.readInt(), parcel.readParcelable(Payload.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Payload[] newArray(int i11) {
                return new Payload[i11];
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.data.model.Notification$Payload$b */
        /* loaded from: classes5.dex */
        public static final class C9410b implements KSerializer {

            /* renamed from: a */
            private final SerialDescriptor f49923a = AbstractC26340g.m135541c("NotiPayload", new SerialDescriptor[0], null, 4, null);

            @Override // qn0.InterfaceC25386a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Payload deserialize(Decoder decoder) {
                InterfaceC27329g interfaceC27329g;
                Video video;
                String str;
                boolean m127128x;
                AbstractC19074t.m100208f(decoder, "decoder");
                Parcelable parcelable = null;
                if (decoder instanceof InterfaceC27329g) {
                    interfaceC27329g = (InterfaceC27329g) decoder;
                } else {
                    interfaceC27329g = null;
                }
                if (interfaceC27329g != null) {
                    JsonObject m139916m = AbstractC27331i.m139916m(interfaceC27329g.mo139898g());
                    int m51728i = AbstractC9465b.m51728i(m139916m, new String[]{"objType"}, 0, 2, null);
                    if (m51728i != 1) {
                        if (m51728i != 2) {
                            if (m51728i != 3) {
                                if (m51728i != 10) {
                                    if (m51728i == 50) {
                                        parcelable = new LinkPayload(AbstractC9465b.m51742w(m139916m, new String[]{"data"}, null, 2, null));
                                    }
                                } else {
                                    JsonElement jsonElement = (JsonElement) m139916m.get("data");
                                    if (jsonElement != null) {
                                        String m51743x = AbstractC9465b.m51743x(AbstractC27331i.m139916m(jsonElement), "cmtId");
                                        String m51743x2 = AbstractC9465b.m51743x(AbstractC27331i.m139916m(jsonElement), "parentId");
                                        boolean m51723d = AbstractC9465b.m51723d(AbstractC27331i.m139916m(jsonElement), new String[]{"isLikedCmt"}, false, 2, null);
                                        JsonElement jsonElement2 = (JsonElement) AbstractC27331i.m139916m(jsonElement).get("video");
                                        if (jsonElement2 != null) {
                                            video = new Video((VideoData) interfaceC27329g.mo139897d().m139866c(new VideoData.C9437b(), jsonElement2));
                                        } else {
                                            video = null;
                                        }
                                        if (video != null) {
                                            str = video.m52911t();
                                        } else {
                                            str = null;
                                        }
                                        if (str != null) {
                                            m127128x = AbstractC24341v.m127128x(str);
                                            if (!m127128x) {
                                                parcelable = new CommentPayload(m51743x, m51743x2, Boolean.valueOf(m51723d), str, video);
                                            }
                                        }
                                    }
                                }
                            } else {
                                JsonElement jsonElement3 = (JsonElement) m139916m.get("data");
                                if (jsonElement3 != null) {
                                    parcelable = new Video((VideoData) interfaceC27329g.mo139897d().m139866c(new VideoData.C9437b(), jsonElement3));
                                }
                            }
                        } else {
                            JsonElement jsonElement4 = (JsonElement) m139916m.get("data");
                            if (jsonElement4 != null) {
                                parcelable = (Channel) interfaceC27329g.mo139897d().m139866c(new Channel.C9382b(), jsonElement4);
                            }
                        }
                    } else {
                        JsonElement jsonElement5 = (JsonElement) m139916m.get("data");
                        if (jsonElement5 != null) {
                            parcelable = (User) interfaceC27329g.mo139897d().m139866c(new User.C9432b(), jsonElement5);
                        }
                    }
                    return new Payload(m51728i, parcelable);
                }
                throw new UnsupportedFormatException();
            }

            @Override // qn0.InterfaceC25393h
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public void serialize(Encoder encoder, Payload payload) {
                AbstractC19074t.m100208f(encoder, "encoder");
                AbstractC19074t.m100208f(payload, "value");
                throw new UnsupportedOperationException();
            }

            @Override // kotlinx.serialization.KSerializer, qn0.InterfaceC25393h, qn0.InterfaceC25386a
            public SerialDescriptor getDescriptor() {
                return this.f49923a;
            }
        }

        public Payload(int i11, Parcelable parcelable) {
            this.f49921p = i11;
            this.f49922q = parcelable;
        }

        /* renamed from: a */
        public final Parcelable m51076a() {
            return this.f49922q;
        }

        /* renamed from: b */
        public final int m51077b() {
            return this.f49921p;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            AbstractC19074t.m100208f(parcel, "out");
            parcel.writeInt(this.f49921p);
            parcel.writeParcelable(this.f49922q, i11);
        }
    }

    @InterfaceC25392g
    /* loaded from: classes5.dex */
    public static final class Target implements Parcelable {

        /* renamed from: p */
        private final int f49925p;

        /* renamed from: q */
        private final String f49926q;

        /* renamed from: r */
        private final Payload f49927r;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Target> CREATOR = new C9411a();

        /* renamed from: s */
        private static final KSerializer[] f49924s = {null, null, Payload.Companion.serializer()};

        /* loaded from: classes5.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
                this();
            }

            public final KSerializer serializer() {
                return Notification$Target$$serializer.INSTANCE;
            }
        }

        /* renamed from: com.zing.zalo.shortvideo.data.model.Notification$Target$a */
        /* loaded from: classes5.dex */
        public static final class C9411a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Target createFromParcel(Parcel parcel) {
                AbstractC19074t.m100208f(parcel, "parcel");
                return new Target(parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Payload.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Target[] newArray(int i11) {
                return new Target[i11];
            }
        }

        public /* synthetic */ Target(int i11, int i12, String str, Payload payload, AbstractC26805k1 abstractC26805k1) {
            if (1 != (i11 & 1)) {
                AbstractC26774a1.m137800b(i11, 1, Notification$Target$$serializer.INSTANCE.getDescriptor());
            }
            this.f49925p = i12;
            if ((i11 & 2) == 0) {
                this.f49926q = null;
            } else {
                this.f49926q = str;
            }
            if ((i11 & 4) == 0) {
                this.f49927r = null;
            } else {
                this.f49927r = payload;
            }
        }

        /* renamed from: e */
        public static final /* synthetic */ void m51083e(Target target, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
            KSerializer[] kSerializerArr = f49924s;
            interfaceC21886d.mo114033x(serialDescriptor, 0, target.f49925p);
            if (interfaceC21886d.mo114019A(serialDescriptor, 1) || target.f49926q != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 1, C26814n1.f127034a, target.f49926q);
            }
            if (interfaceC21886d.mo114019A(serialDescriptor, 2) || target.f49927r != null) {
                interfaceC21886d.mo114028h(serialDescriptor, 2, kSerializerArr[2], target.f49927r);
            }
        }

        /* renamed from: b */
        public final int m51084b() {
            return this.f49925p;
        }

        /* renamed from: c */
        public final Payload m51085c() {
            return this.f49927r;
        }

        /* renamed from: d */
        public final String m51086d() {
            return this.f49926q;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            AbstractC19074t.m100208f(parcel, "out");
            parcel.writeInt(this.f49925p);
            parcel.writeString(this.f49926q);
            Payload payload = this.f49927r;
            if (payload == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                payload.writeToParcel(parcel, i11);
            }
        }

        public Target(int i11, String str, Payload payload) {
            this.f49925p = i11;
            this.f49926q = str;
            this.f49927r = payload;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.data.model.Notification$a */
    /* loaded from: classes5.dex */
    public static final class C9412a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Notification createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            String readString = parcel.readString();
            Content createFromParcel = Content.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            long readLong = parcel.readLong();
            Parcelable.Creator<Target> creator = Target.CREATOR;
            return new Notification(readString, createFromParcel, readString2, readInt, readLong, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Notification[] newArray(int i11) {
            return new Notification[i11];
        }
    }

    public /* synthetic */ Notification(int i11, String str, Content content, String str2, int i12, long j11, Target target, Target target2, Integer num, AbstractC26805k1 abstractC26805k1) {
        if (123 != (i11 & 123)) {
            AbstractC26774a1.m137800b(i11, 123, Notification$$serializer.INSTANCE.getDescriptor());
        }
        this.f49906p = str;
        this.f49907q = content;
        if ((i11 & 4) == 0) {
            this.f49908r = "";
        } else {
            this.f49908r = str2;
        }
        this.f49909s = i12;
        this.f49910t = j11;
        this.f49911u = target;
        this.f49912v = target2;
        this.f49913w = -1;
        if ((i11 & 128) == 0) {
            this.f49914x = null;
        } else {
            this.f49914x = num;
        }
    }

    /* renamed from: q */
    public static final /* synthetic */ void m51048q(Notification notification, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114035z(serialDescriptor, 0, notification.f49906p);
        interfaceC21886d.mo114029i(serialDescriptor, 1, Content$$serializer.INSTANCE, notification.f49907q);
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || !AbstractC19074t.m100204b(notification.f49908r, "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 2, notification.f49908r);
        }
        interfaceC21886d.mo114033x(serialDescriptor, 3, notification.f49909s);
        interfaceC21886d.mo114022E(serialDescriptor, 4, notification.f49910t);
        Notification$Target$$serializer notification$Target$$serializer = Notification$Target$$serializer.INSTANCE;
        interfaceC21886d.mo114029i(serialDescriptor, 5, notification$Target$$serializer, notification.f49911u);
        interfaceC21886d.mo114029i(serialDescriptor, 6, notification$Target$$serializer, notification.f49912v);
        if (interfaceC21886d.mo114019A(serialDescriptor, 7) || notification.f49914x != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 7, C26783d0.f126989a, notification.f49914x);
        }
    }

    /* renamed from: a */
    public final Content m51049a() {
        return this.f49907q;
    }

    /* renamed from: b */
    public final long m51050b() {
        return this.f49910t;
    }

    /* renamed from: c */
    public final Target m51051c() {
        return this.f49912v;
    }

    /* renamed from: d */
    public final Target m51052d() {
        return this.f49911u;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int m51053e() {
        return this.f49913w;
    }

    /* renamed from: f */
    public final String m51054f() {
        return this.f49906p;
    }

    /* renamed from: g */
    public final int m51055g() {
        return this.f49909s;
    }

    /* renamed from: h */
    public final String m51056h() {
        return this.f49908r;
    }

    /* renamed from: i */
    public final boolean m51057i() {
        Video m51067c;
        Payload m51085c = this.f49912v.m51085c();
        if (m51085c == null) {
            return false;
        }
        Parcelable m51076a = m51085c.m51076a();
        if (!(m51076a instanceof CommentPayload)) {
            m51076a = null;
        }
        CommentPayload commentPayload = (CommentPayload) m51076a;
        if (commentPayload == null || (m51067c = commentPayload.m51067c()) == null || !m51067c.m52886e0()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final boolean m51058j() {
        Payload m51085c = this.f49911u.m51085c();
        if (m51085c != null) {
            Parcelable m51076a = m51085c.m51076a();
            if (!(m51076a instanceof Channel)) {
                m51076a = null;
            }
            Channel channel = (Channel) m51076a;
            if (channel != null) {
                return AbstractC19074t.m100204b(channel.m50742R(), Boolean.TRUE);
            }
        }
        return false;
    }

    /* renamed from: k */
    public final Boolean m51059k() {
        Payload m51085c = this.f49911u.m51085c();
        if (m51085c == null) {
            return null;
        }
        Parcelable m51076a = m51085c.m51076a();
        if (!(m51076a instanceof Channel)) {
            m51076a = null;
        }
        Channel channel = (Channel) m51076a;
        if (channel == null) {
            return null;
        }
        return Boolean.valueOf(channel.m50741Q());
    }

    /* renamed from: l */
    public final Boolean m51060l() {
        Payload m51085c = this.f49912v.m51085c();
        if (m51085c == null) {
            return null;
        }
        Parcelable m51076a = m51085c.m51076a();
        if (!(m51076a instanceof CommentPayload)) {
            m51076a = null;
        }
        CommentPayload commentPayload = (CommentPayload) m51076a;
        if (commentPayload == null) {
            return null;
        }
        return commentPayload.m51069e();
    }

    /* renamed from: m */
    public final boolean m51061m() {
        Integer num = this.f49914x;
        if (num == null || (num.intValue() & 1) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public final void m51062n(int i11) {
        this.f49913w = i11;
    }

    /* renamed from: o */
    public final void m51063o() {
        Integer num = this.f49914x;
        if (num != null) {
            this.f49914x = Integer.valueOf(num.intValue() | 1);
        }
    }

    /* renamed from: p */
    public final void m51064p(boolean z11) {
        Payload m51085c = this.f49912v.m51085c();
        CommentPayload commentPayload = null;
        Parcelable parcelable = null;
        if (m51085c != null) {
            Parcelable m51076a = m51085c.m51076a();
            if (m51076a instanceof CommentPayload) {
                parcelable = m51076a;
            }
            commentPayload = (CommentPayload) parcelable;
        }
        if (commentPayload != null) {
            commentPayload.m51070f(Boolean.valueOf(z11));
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int intValue;
        AbstractC19074t.m100208f(parcel, "out");
        parcel.writeString(this.f49906p);
        this.f49907q.writeToParcel(parcel, i11);
        parcel.writeString(this.f49908r);
        parcel.writeInt(this.f49909s);
        parcel.writeLong(this.f49910t);
        this.f49911u.writeToParcel(parcel, i11);
        this.f49912v.writeToParcel(parcel, i11);
        parcel.writeInt(this.f49913w);
        Integer num = this.f49914x;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
    }

    public Notification(String str, Content content, String str2, int i11, long j11, Target target, Target target2, int i12, Integer num) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(content, "content");
        AbstractC19074t.m100208f(str2, "subContent");
        AbstractC19074t.m100208f(target, "from");
        AbstractC19074t.m100208f(target2, "dest");
        this.f49906p = str;
        this.f49907q = content;
        this.f49908r = str2;
        this.f49909s = i11;
        this.f49910t = j11;
        this.f49911u = target;
        this.f49912v = target2;
        this.f49913w = i12;
        this.f49914x = num;
    }
}
