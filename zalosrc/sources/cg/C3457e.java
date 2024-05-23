package cg;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import bn0.AbstractC2933b;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23254w8;
import on0.AbstractC24341v;
import pl0.AbstractC24827h;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24861r;
import qm0.AbstractC25358n;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;

/* renamed from: cg.e */
/* loaded from: classes3.dex */
public final class C3457e {

    /* renamed from: a */
    public static final C3457e f14537a = new C3457e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cg.e$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ String f14538q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.f14538q = str;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(MediaCodecInfo mediaCodecInfo) {
            boolean m131390w;
            AbstractC19074t.m100208f(mediaCodecInfo, "mediacodecInfo");
            String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
            AbstractC19074t.m100207e(supportedTypes, "getSupportedTypes(...)");
            m131390w = AbstractC25358n.m131390w(supportedTypes, this.f14538q);
            return Boolean.valueOf(m131390w);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cg.e$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ String f14539q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f14539q = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:            if (r2 == false) goto L6;     */
        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean mo205i9(MediaCodecInfo mediaCodecInfo) {
            boolean z11;
            boolean isHardwareAccelerated;
            AbstractC19074t.m100208f(mediaCodecInfo, "mediacodecInfo");
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
            }
            if (i11 >= 29 || AbstractC24827h.m129087o(mediaCodecInfo, this.f14539q)) {
                z11 = false;
                return Boolean.valueOf(z11);
            }
            z11 = true;
            return Boolean.valueOf(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cg.e$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ String f14540q;

        /* renamed from: r */
        final /* synthetic */ MediaFormat f14541r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, MediaFormat mediaFormat) {
            super(1);
            this.f14540q = str;
            this.f14541r = mediaFormat;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(MediaCodecInfo mediaCodecInfo) {
            Object m129218b;
            boolean isFormatSupported;
            Object m129218b2;
            AbstractC19074t.m100208f(mediaCodecInfo, "mediaCodecInfo");
            C3457e c3457e = C3457e.f14537a;
            String str = this.f14540q;
            try {
                C24861r.a aVar = C24861r.f119264q;
                m129218b = C24861r.m129218b(mediaCodecInfo.getCapabilitiesForType(str));
            } catch (Throwable th2) {
                C24861r.a aVar2 = C24861r.f119264q;
                m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
            }
            if (C24861r.m129223g(m129218b)) {
                m129218b = null;
            }
            MediaCodecInfo.CodecCapabilities codecCapabilities = (MediaCodecInfo.CodecCapabilities) m129218b;
            C3457e c3457e2 = C3457e.f14537a;
            MediaFormat mediaFormat = this.f14541r;
            if (codecCapabilities != null) {
                try {
                    isFormatSupported = codecCapabilities.isFormatSupported(mediaFormat);
                } catch (Throwable th3) {
                    C24861r.a aVar3 = C24861r.f119264q;
                    m129218b2 = C24861r.m129218b(AbstractC24862s.m129227a(th3));
                }
            } else {
                isFormatSupported = false;
            }
            m129218b2 = C24861r.m129218b(Boolean.valueOf(isFormatSupported));
            Boolean bool = Boolean.FALSE;
            if (C24861r.m129223g(m129218b2)) {
                m129218b2 = bool;
            }
            return (Boolean) m129218b2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cg.e$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ int f14542q;

        /* renamed from: r */
        final /* synthetic */ int f14543r;

        /* renamed from: s */
        final /* synthetic */ int f14544s;

        /* renamed from: t */
        final /* synthetic */ String f14545t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i11, int i12, int i13, String str) {
            super(1);
            this.f14542q = i11;
            this.f14543r = i12;
            this.f14544s = i13;
            this.f14545t = str;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(MediaCodecInfo mediaCodecInfo) {
            Object m129218b;
            MediaCodecInfo.VideoCapabilities videoCapabilities;
            MediaCodecInfo.VideoCapabilities videoCapabilities2;
            AbstractC19074t.m100208f(mediaCodecInfo, "mediaCodecInfo");
            C3457e c3457e = C3457e.f14537a;
            String str = this.f14545t;
            try {
                C24861r.a aVar = C24861r.f119264q;
                m129218b = C24861r.m129218b(mediaCodecInfo.getCapabilitiesForType(str));
            } catch (Throwable th2) {
                C24861r.a aVar2 = C24861r.f119264q;
                m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
            }
            if (C24861r.m129223g(m129218b)) {
                m129218b = null;
            }
            MediaCodecInfo.CodecCapabilities codecCapabilities = (MediaCodecInfo.CodecCapabilities) m129218b;
            boolean z11 = false;
            if (this.f14542q == -1) {
                if (codecCapabilities != null && (videoCapabilities2 = codecCapabilities.getVideoCapabilities()) != null) {
                    z11 = videoCapabilities2.isSizeSupported(this.f14543r, this.f14544s);
                }
            } else if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
                z11 = videoCapabilities.areSizeAndRateSupported(this.f14543r, this.f14544s, this.f14542q);
            }
            return Boolean.valueOf(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cg.e$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final e f14546q = new e();

        e() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:            if (r3 != false) goto L6;     */
        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean mo205i9(MediaCodecInfo mediaCodecInfo) {
            boolean z11;
            boolean isAlias;
            AbstractC19074t.m100208f(mediaCodecInfo, "mediaCodecInfo");
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                isAlias = mediaCodecInfo.isAlias();
            }
            if (i11 >= 29) {
                z11 = false;
                return Boolean.valueOf(z11);
            }
            z11 = true;
            return Boolean.valueOf(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cg.e$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final f f14547q = new f();

        f() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(MediaCodecInfo mediaCodecInfo) {
            boolean m127120J;
            AbstractC19074t.m100208f(mediaCodecInfo, "mediaCodecInfo");
            String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
            AbstractC19074t.m100207e(supportedTypes, "getSupportedTypes(...)");
            int length = supportedTypes.length;
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                String str = supportedTypes[i11];
                AbstractC19074t.m100205c(str);
                m127120J = AbstractC24341v.m127120J(str, "video/", false, 2, null);
                if (m127120J) {
                    z11 = true;
                    break;
                }
                i11++;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cg.e$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final g f14548q = new g();

        g() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(MediaCodecInfo mediaCodecInfo) {
            AbstractC19074t.m100208f(mediaCodecInfo, "mediaCodecInfo");
            return Boolean.valueOf(!mediaCodecInfo.isEncoder());
        }
    }

    private C3457e() {
    }

    /* renamed from: a */
    private final MediaExtractor m17408a(String str, Context context) {
        MediaExtractor mediaExtractor = new MediaExtractor();
        if (AbstractC23254w8.m119859g(str)) {
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(Uri.parse(str), "r");
                if (openFileDescriptor != null) {
                    try {
                        mediaExtractor.setDataSource(openFileDescriptor.getFileDescriptor());
                    } finally {
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
                AbstractC2933b.m13890a(openFileDescriptor, null);
            } catch (IOException e11) {
                e11.printStackTrace();
            }
        } else {
            mediaExtractor.setDataSource(str);
        }
        return mediaExtractor;
    }

    /* renamed from: b */
    public static final MediaCodecInfo m17409b(Context context, String str) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, "videoPath");
        C3457e c3457e = f14537a;
        MediaFormat m17411d = c3457e.m17411d(str, context);
        if (m17411d != null) {
            return c3457e.m17410c(m17411d);
        }
        return null;
    }

    /* renamed from: c */
    private final MediaCodecInfo m17410c(MediaFormat mediaFormat) {
        String m17425f;
        int m17423d;
        int m17423d2;
        int m17423d3;
        Object m17424e;
        Object obj;
        List m131506n;
        Object obj2;
        int m131511r;
        List m17412e = m17412e();
        m17425f = AbstractC3458f.m17425f(mediaFormat, "mime", "");
        m17423d = AbstractC3458f.m17423d(mediaFormat, "width", -1);
        m17423d2 = AbstractC3458f.m17423d(mediaFormat, "height", -1);
        m17423d3 = AbstractC3458f.m17423d(mediaFormat, "frame-rate", -1);
        m17424e = AbstractC3458f.m17424e(mediaFormat, "profile");
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23) {
            obj = AbstractC3458f.m17424e(mediaFormat, "level");
        } else {
            obj = null;
        }
        if (m17425f.length() != 0 && m17423d != -1 && m17423d2 != -1 && (m17423d3 != -1 || i11 < 23)) {
            m131506n = AbstractC25368s.m131506n(new a(m17425f), new b(m17425f), new c(m17425f, mediaFormat), new d(m17423d3, m17423d, m17423d2, m17425f));
            List<MediaCodecInfo> list = m17412e;
            loop0: for (Object obj3 : list) {
                MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) obj3;
                List list2 = m131506n;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (!((Boolean) ((InterfaceC18505l) it.next()).mo205i9(mediaCodecInfo)).booleanValue()) {
                            break;
                        }
                    }
                }
                obj2 = obj3;
            }
            obj2 = null;
            MediaCodecInfo mediaCodecInfo2 = (MediaCodecInfo) obj2;
            for (MediaCodecInfo mediaCodecInfo3 : list) {
                List list3 = m131506n;
                m131511r = AbstractC25370t.m131511r(list3, 10);
                ArrayList arrayList = new ArrayList(m131511r);
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Boolean.valueOf(((Boolean) ((InterfaceC18505l) it2.next()).mo205i9(mediaCodecInfo3)).booleanValue()));
                }
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    int i12 = 0;
                    while (it3.hasNext()) {
                        if (((Boolean) it3.next()).booleanValue() && (i12 = i12 + 1) < 0) {
                            AbstractC25368s.m131508p();
                        }
                    }
                    if (i12 >= 2) {
                        AbstractC20110a.f98889a.mo104556o(8, "[findHWDecoder] Decoder %s check result: isFormatSupported = %b, areSizeAndRateSupported = %b", mediaCodecInfo3.getName(), arrayList.get(2), arrayList.get(3));
                    }
                }
            }
            if (mediaCodecInfo2 == null) {
                AbstractC20110a.a aVar = AbstractC20110a.f98889a;
                Object[] objArr = new Object[6];
                objArr[0] = m17425f;
                if (m17424e == null) {
                    m17424e = "null";
                }
                objArr[1] = m17424e;
                if (obj == null) {
                    obj = "null";
                }
                objArr[2] = obj;
                objArr[3] = Integer.valueOf(m17423d);
                objArr[4] = Integer.valueOf(m17423d2);
                objArr[5] = Integer.valueOf(m17423d3);
                aVar.mo104556o(8, "[findHWDecoder] Cannot find suitable decoder for input video. Mime = %s, Profile = %d, Level = %d, Width = %d, Height = %d, FrameRate = %d", objArr);
            }
            return mediaCodecInfo2;
        }
        AbstractC20110a.f98889a.mo104556o(8, "[findHWDecoder] Some info is missing: mime = %, width = %d, height = %d, frameRate = %d", m17425f, Integer.valueOf(m17423d), Integer.valueOf(m17423d2), Integer.valueOf(m17423d3));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:            if (r8 == null) goto L29;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final MediaFormat m17411d(String str, Context context) {
        MediaExtractor mediaExtractor;
        boolean m127120J;
        MediaExtractor mediaExtractor2 = 0;
        try {
            try {
                mediaExtractor = m17408a(str, context);
            } catch (Exception e11) {
                e = e11;
                mediaExtractor = null;
            } catch (Throwable th2) {
                th = th2;
                if (mediaExtractor2 != 0) {
                }
                throw th;
            }
            try {
                int trackCount = mediaExtractor.getTrackCount();
                for (int i11 = 0; i11 < trackCount; i11++) {
                    MediaFormat trackFormat = mediaExtractor.getTrackFormat(i11);
                    AbstractC19074t.m100207e(trackFormat, "getTrackFormat(...)");
                    String string = trackFormat.getString("mime");
                    if (string != null) {
                        m127120J = AbstractC24341v.m127120J(string, "video/", false, 2, null);
                        if (m127120J) {
                            if (Build.VERSION.SDK_INT == 21) {
                                trackFormat.setString("frame-rate", null);
                            }
                            mediaExtractor.release();
                            return trackFormat;
                        }
                    }
                }
            } catch (Exception e12) {
                e = e12;
                AbstractC20110a.f98889a.mo104552e(e);
            }
            mediaExtractor.release();
            return null;
        } catch (Throwable th3) {
            th = th3;
            mediaExtractor2 = str;
            if (mediaExtractor2 != 0) {
                mediaExtractor2.release();
            }
            throw th;
        }
    }

    /* renamed from: e */
    private final List m17412e() {
        List m131506n;
        m131506n = AbstractC25368s.m131506n(e.f14546q, f.f14547q, g.f14548q);
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        AbstractC19074t.m100205c(codecInfos);
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            List<InterfaceC18505l> list = m131506n;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (InterfaceC18505l interfaceC18505l : list) {
                    AbstractC19074t.m100205c(mediaCodecInfo);
                    if (!((Boolean) interfaceC18505l.mo205i9(mediaCodecInfo)).booleanValue()) {
                        break;
                    }
                }
            }
            arrayList.add(mediaCodecInfo);
        }
        return arrayList;
    }
}
