package com.zing.zalo.videoencode;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Build;
import android.text.TextUtils;
import android.view.Surface;
import com.zing.zalo.videoencode.exception.VideoEncoderException;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import ff0.AbstractC18909f;
import ff0.C18904a;
import ff0.C18905b;
import gf0.C19436a;
import ho0.AbstractC20110a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: com.zing.zalo.videoencode.b */
/* loaded from: classes5.dex */
public class C16777b extends AbstractC16778c {

    /* renamed from: v */
    private MediaCodec.BufferInfo f85107v;

    /* renamed from: w */
    private float f85108w;

    public C16777b(C19436a c19436a) {
        super(c19436a);
        this.f85108w = 0.0f;
    }

    /* renamed from: A */
    private int m89547A(boolean z11) {
        int trackCount = this.f85117f.getTrackCount();
        for (int i11 = 0; i11 < trackCount; i11++) {
            String string = this.f85117f.getTrackFormat(i11).getString("mime");
            if (!TextUtils.isEmpty(string)) {
                if (z11) {
                    if (string.startsWith("audio/")) {
                        return i11;
                    }
                } else if (string.startsWith("video/")) {
                    return i11;
                }
            }
        }
        return -5;
    }

    /* renamed from: t */
    private MediaCodec m89548t(MediaFormat mediaFormat, Surface surface) {
        if (surface == null) {
            return null;
        }
        AbstractC20110a.m104535d("configDecoder", new Object[0]);
        try {
            String string = mediaFormat.getString("mime");
            for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
                try {
                    if (mediaCodecInfo.getCapabilitiesForType(string).isFormatSupported(mediaFormat) && AbstractC18909f.m99113a(mediaCodecInfo, true)) {
                        MediaCodec createByCodecName = MediaCodec.createByCodecName(mediaCodecInfo.getName());
                        try {
                            createByCodecName.configure(mediaFormat, surface, (MediaCrypto) null, 0);
                            String name = createByCodecName.getName();
                            if (Build.VERSION.SDK_INT >= 29) {
                                name = createByCodecName.getCanonicalName();
                            }
                            m89565k(String.format("[VBE] Picked codec %s (%s) for decoding", name, createByCodecName.getName()));
                            AbstractC20110a.m104535d("config decoder successfully", new Object[0]);
                            return createByCodecName;
                        } catch (IllegalArgumentException | IllegalStateException unused) {
                            createByCodecName.release();
                        }
                    }
                } catch (IOException | IllegalArgumentException unused2) {
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104538g(e11.toString(), new Object[0]);
        }
        AbstractC20110a.m104538g("fail to config decoder - no decoder found", new Object[0]);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x079b, code lost:            if (r46.f85126o.m101629w() != 1) goto L610;     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0205, code lost:            if (r10 == (-1)) goto L350;     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x059f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x032f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x05a3  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m89549w(ByteBuffer byteBuffer, int i11, int i12, MediaFormat mediaFormat, MediaFormat mediaFormat2) {
        int i13;
        double d11;
        String str;
        int i14;
        int i15;
        boolean z11;
        int dequeueOutputBuffer;
        int i16;
        double d12;
        long j11;
        boolean z12;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        int i17;
        int i18;
        int i19;
        int i21;
        boolean z13;
        long j12;
        int dequeueInputBuffer;
        int i22;
        ByteBuffer byteBuffer4;
        int i23;
        int dequeueInputBuffer2;
        boolean z14;
        ByteBuffer byteBuffer5 = byteBuffer;
        int i24 = i12;
        long m101626t = this.f85126o.m101626t() * 1000;
        LinkedList linkedList = new LinkedList();
        double d13 = 0.0d;
        boolean z15 = false;
        int i25 = -1;
        boolean z16 = false;
        int i26 = 0;
        int i27 = 0;
        boolean z17 = false;
        boolean z18 = false;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        int i28 = 0;
        boolean z19 = false;
        int i29 = -5;
        int i31 = 0;
        while (!z15) {
            if (z17) {
                i13 = i27;
                d11 = d13;
                str = " with pts=";
            } else {
                int sampleTrackIndex = this.f85117f.getSampleTrackIndex();
                if (z18 && sampleTrackIndex == i24 && !m89551y()) {
                    i13 = i27;
                    this.f85107v.size = this.f85117f.readSampleData(byteBuffer5, 0);
                    MediaCodec.BufferInfo bufferInfo = this.f85107v;
                    if (bufferInfo.size < 0) {
                        bufferInfo.size = 0;
                        d11 = d13;
                        str = " with pts=";
                        z14 = true;
                    } else {
                        d11 = d13;
                        bufferInfo.presentationTimeUs = this.f85117f.getSampleTime();
                        MediaCodec.BufferInfo bufferInfo2 = this.f85107v;
                        if (m101626t > bufferInfo2.presentationTimeUs) {
                            this.f85117f.advance();
                            i27 = i13;
                            d13 = d11;
                        } else {
                            bufferInfo2.offset = 0;
                            bufferInfo2.flags = this.f85117f.getSampleFlags();
                            this.f85125n.writeSampleData(i25, byteBuffer5, this.f85107v);
                            this.f85117f.advance();
                            str = " with pts=";
                            z14 = false;
                        }
                    }
                } else {
                    i13 = i27;
                    d11 = d13;
                    if (sampleTrackIndex == i11) {
                        if (this.f85126o.m101629w() == 1) {
                            byteBuffer4 = ByteBuffer.allocateDirect(mediaFormat.getInteger("max-input-size"));
                            i22 = -1;
                        } else {
                            int dequeueInputBuffer3 = this.f85121j.dequeueInputBuffer(2500L);
                            if (dequeueInputBuffer3 >= 0) {
                                i22 = dequeueInputBuffer3;
                                byteBuffer4 = this.f85121j.getInputBuffer(dequeueInputBuffer3);
                            } else {
                                i22 = dequeueInputBuffer3;
                                byteBuffer4 = null;
                            }
                        }
                        if (i22 < 0) {
                            i23 = 0;
                            AbstractC20110a.m104538g("for some reason, decoder cannot dequeue input buffer - %s", Integer.valueOf(i22));
                        } else {
                            i23 = 0;
                        }
                        if (byteBuffer4 != null && byteBuffer4.capacity() >= 0) {
                            int readSampleData = this.f85117f.readSampleData(byteBuffer4, i23);
                            if (readSampleData < 0) {
                                if (this.f85126o.m101629w() == 0 && (dequeueInputBuffer2 = this.f85121j.dequeueInputBuffer(2500L)) >= 0) {
                                    this.f85121j.queueInputBuffer(dequeueInputBuffer2, 0, 0, 0L, 4);
                                    AbstractC20110a.m104535d("submitted end of stream frame due to chunkSize=" + readSampleData + " < 0", new Object[0]);
                                }
                                str = " with pts=";
                                z17 = true;
                            } else {
                                long sampleTime = this.f85117f.getSampleTime();
                                if (!z18 && sampleTime > m101626t) {
                                    this.f85117f.seekTo(m101626t - (sampleTime - m101626t), 0);
                                    this.f85121j.queueInputBuffer(i22, 0, 0, 0L, 0);
                                    AbstractC20110a.m104535d("current pts=" + sampleTime + " is greater than trimStart on first seek. Try to seek to previous keyframe!!!", new Object[0]);
                                    j13 = sampleTime;
                                    i27 = i13;
                                    d13 = d11;
                                    z18 = true;
                                    byteBuffer5 = byteBuffer;
                                    i24 = i12;
                                } else {
                                    if (this.f85126o.m101629w() != 0) {
                                        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(readSampleData);
                                        allocateDirect.put(byteBuffer4);
                                        allocateDirect.position(0);
                                        linkedList.add(allocateDirect);
                                    }
                                    if (i22 >= 0) {
                                        this.f85121j.queueInputBuffer(i22, 0, readSampleData, sampleTime, 0);
                                        if (m89552z(i26)) {
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("submitted frame ");
                                            sb2.append(i26);
                                            sb2.append(" to dec, size=");
                                            sb2.append(readSampleData);
                                            str = " with pts=";
                                            sb2.append(str);
                                            sb2.append(sampleTime);
                                            AbstractC20110a.m104535d(sb2.toString(), new Object[0]);
                                            i26++;
                                            this.f85117f.advance();
                                            j13 = sampleTime;
                                            i13 = i26;
                                            z18 = true;
                                        }
                                    }
                                    str = " with pts=";
                                    i26++;
                                    this.f85117f.advance();
                                    j13 = sampleTime;
                                    i13 = i26;
                                    z18 = true;
                                }
                            }
                        } else {
                            str = " with pts=";
                            AbstractC20110a.m104538g("cannot allocate video input buffer", new Object[0]);
                        }
                    } else {
                        str = " with pts=";
                    }
                    z14 = false;
                }
                if (z14) {
                    if (this.f85126o.m101629w() == 0) {
                        int dequeueInputBuffer4 = this.f85121j.dequeueInputBuffer(2500L);
                        if (dequeueInputBuffer4 >= 0) {
                            this.f85121j.queueInputBuffer(dequeueInputBuffer4, 0, 0, 0L, 4);
                            AbstractC20110a.m104535d("submitted end of stream frame due to end of file", new Object[0]);
                            z17 = true;
                        }
                    } else {
                        AbstractC20110a.m104535d("Do the loop when end of file occurs", new Object[0]);
                        i28 = this.f85126o.m101616j() == 0 ? 1 : (this.f85126o.m101616j() * 2) - 1;
                        i14 = i13 - 1;
                        z17 = true;
                        if (this.f85126o.m101629w() != 0 && z17 && !z19) {
                            if (i28 <= 0 && i14 >= 0) {
                                int dequeueInputBuffer5 = this.f85121j.dequeueInputBuffer(2500L);
                                if (dequeueInputBuffer5 >= 0) {
                                    ByteBuffer inputBuffer = this.f85121j.getInputBuffer(dequeueInputBuffer5);
                                    ByteBuffer byteBuffer6 = (ByteBuffer) linkedList.get(i14);
                                    int remaining = byteBuffer6.remaining();
                                    inputBuffer.put(byteBuffer6);
                                    inputBuffer.limit(remaining);
                                    i15 = i25;
                                    inputBuffer.position(0);
                                    byteBuffer6.position(0);
                                    long j16 = j13 + AbstractC16778c.f85111u;
                                    this.f85121j.queueInputBuffer(dequeueInputBuffer5, 0, remaining, j16, 0);
                                    if (m89552z(i26)) {
                                        AbstractC20110a.m104535d("submitted frame again " + i14 + " to dec, size=" + remaining + str + j16, new Object[0]);
                                    }
                                    i14 = i28 % 2 != 0 ? i14 - 1 : i14 + 1;
                                    if (i14 == -1) {
                                        i28--;
                                        i14 = 0;
                                    }
                                    if (i14 == i26) {
                                        i28--;
                                        i14--;
                                    }
                                    j13 = j16;
                                }
                            } else {
                                i15 = i25;
                                AbstractC20110a.m104535d("submitted end of stream frame when all packets are traversed", new Object[0]);
                                dequeueInputBuffer = this.f85121j.dequeueInputBuffer(2500L);
                                if (dequeueInputBuffer >= 0) {
                                    this.f85121j.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                    linkedList.clear();
                                    z19 = true;
                                }
                            }
                            z11 = !z16;
                            int i32 = i29;
                            i25 = i15;
                            d13 = d11;
                            boolean z21 = true;
                            while (true) {
                                if (z11 && !z21) {
                                    i27 = i14;
                                    i29 = i32;
                                    break;
                                }
                                boolean z22 = z15;
                                LinkedList linkedList2 = linkedList;
                                boolean z23 = z11;
                                dequeueOutputBuffer = this.f85123l.dequeueOutputBuffer(this.f85107v, 2500L);
                                int i33 = i14;
                                i16 = -1;
                                if (dequeueOutputBuffer != -1) {
                                    j11 = m101626t;
                                    d12 = d13;
                                    z21 = false;
                                } else {
                                    if (dequeueOutputBuffer == -3) {
                                        j11 = m101626t;
                                        d12 = d13;
                                    } else if (dequeueOutputBuffer != -2) {
                                        int i34 = i25;
                                        boolean z24 = z21;
                                        if (dequeueOutputBuffer >= 0) {
                                            d12 = d13;
                                            long j17 = this.f85107v.presentationTimeUs;
                                            ByteBuffer outputBuffer = this.f85123l.getOutputBuffer(dequeueOutputBuffer);
                                            if (outputBuffer != null) {
                                                MediaCodec.BufferInfo bufferInfo3 = this.f85107v;
                                                int i35 = bufferInfo3.size;
                                                if (i35 > 1) {
                                                    if ((bufferInfo3.flags & 2) == 0) {
                                                        if (m89552z(i26)) {
                                                            AbstractC20110a.m104535d("encoder given buffer " + dequeueOutputBuffer + " (size=" + this.f85107v.size + ") (pts=" + j17 + ")", new Object[0]);
                                                        }
                                                        this.f85125n.writeSampleData(i32, outputBuffer, this.f85107v);
                                                    } else if (i32 == -5) {
                                                        byte[] bArr = new byte[i35];
                                                        outputBuffer.limit(bufferInfo3.offset + i35);
                                                        outputBuffer.position(this.f85107v.offset);
                                                        outputBuffer.get(bArr);
                                                        byte b11 = 1;
                                                        int i36 = this.f85107v.size - 1;
                                                        while (i36 >= 0 && i36 > 3) {
                                                            if (bArr[i36] == b11 && bArr[i36 - 1] == 0 && bArr[i36 - 2] == 0) {
                                                                int i37 = i36 - 3;
                                                                if (bArr[i37] == 0) {
                                                                    byteBuffer2 = ByteBuffer.allocate(i37);
                                                                    byteBuffer3 = ByteBuffer.allocate(this.f85107v.size - i37);
                                                                    j11 = m101626t;
                                                                    byteBuffer2.put(bArr, 0, i37).position(0);
                                                                    byteBuffer3.put(bArr, i37, this.f85107v.size - i37).position(0);
                                                                    break;
                                                                }
                                                            }
                                                            i36--;
                                                            m101626t = m101626t;
                                                            b11 = 1;
                                                        }
                                                        j11 = m101626t;
                                                        byteBuffer2 = null;
                                                        byteBuffer3 = null;
                                                        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", this.f85112a, this.f85113b);
                                                        if (byteBuffer2 != null && byteBuffer3 != null) {
                                                            createVideoFormat.setByteBuffer("csd-0", byteBuffer2);
                                                            createVideoFormat.setByteBuffer("csd-1", byteBuffer3);
                                                        }
                                                        i32 = this.f85125n.addTrack(createVideoFormat);
                                                        i17 = this.f85116e;
                                                        i18 = ((this.f85107v.flags & 4) == 0 || j17 <= 0) ? i17 : (int) (((float) (100 * j17)) / (this.f85108w * 1000000.0f));
                                                        if (i18 != i17) {
                                                            this.f85116e = i18;
                                                            AbstractC20110a.m104544m("percent " + this.f85116e + " pts " + (j17 * 100) + " duration " + (this.f85108w * 1000000.0f), new Object[0]);
                                                            if (this.f85126o.m101610d() != null) {
                                                                this.f85126o.m101610d().mo50435a(this.f85116e);
                                                            }
                                                            int i38 = this.f85116e;
                                                            if (i38 % 10 == 0) {
                                                                m89565k(String.format("[VBE] progressing: %s", Integer.valueOf(i38)));
                                                            }
                                                        }
                                                    }
                                                    j11 = m101626t;
                                                    i17 = this.f85116e;
                                                    if ((this.f85107v.flags & 4) == 0) {
                                                    }
                                                    if (i18 != i17) {
                                                    }
                                                } else {
                                                    j11 = m101626t;
                                                }
                                                boolean z25 = (this.f85107v.flags & 4) != 0;
                                                if (z25) {
                                                    this.f85116e = 100;
                                                    if (this.f85126o.m101610d() != null) {
                                                        this.f85126o.m101610d().mo50435a(this.f85116e);
                                                    }
                                                    z12 = false;
                                                    m89565k(String.format("[VBE] progressing: %s", Integer.valueOf(this.f85116e)));
                                                } else {
                                                    z12 = false;
                                                }
                                                this.f85123l.releaseOutputBuffer(dequeueOutputBuffer, z12);
                                                z22 = z25;
                                                i25 = i34;
                                                z21 = z24;
                                            } else {
                                                AbstractC20110a.m104538g("encoderOutputBuffer " + dequeueOutputBuffer + " was null", new Object[0]);
                                                throw new VideoEncoderException(-1, new IllegalStateException("encoderOutputBuffer " + dequeueOutputBuffer + " was null"));
                                            }
                                        } else {
                                            AbstractC20110a.m104538g("unexpected result from encoder.dequeueOutputBuffer: %s", Integer.valueOf(dequeueOutputBuffer));
                                            throw new VideoEncoderException(-1, new IllegalStateException("unexpected result from encoder.dequeueOutputBuffer: " + dequeueOutputBuffer));
                                        }
                                    } else if (!this.f85129r) {
                                        MediaFormat outputFormat = this.f85123l.getOutputFormat();
                                        int addTrack = this.f85125n.addTrack(outputFormat);
                                        int i39 = i25;
                                        StringBuilder sb3 = new StringBuilder();
                                        boolean z26 = z21;
                                        sb3.append("encoder output format changed: ");
                                        sb3.append(outputFormat);
                                        sb3.append(" videoIndex ");
                                        sb3.append(addTrack);
                                        AbstractC20110a.m104535d(sb3.toString(), new Object[0]);
                                        if (i12 < 0 || m89551y()) {
                                            i19 = i39;
                                        } else {
                                            this.f85117f.selectTrack(i12);
                                            i19 = this.f85125n.addTrack(mediaFormat2);
                                        }
                                        this.f85125n.start();
                                        this.f85129r = true;
                                        AbstractC20110a.m104535d("media muxer is started here", new Object[0]);
                                        j11 = m101626t;
                                        i25 = i19;
                                        z21 = z26;
                                        i32 = addTrack;
                                        i16 = -1;
                                        d12 = d13;
                                    } else {
                                        AbstractC20110a.m104535d("format changed twice", new Object[0]);
                                        throw new VideoEncoderException(-1, new IllegalStateException("format changed twice"));
                                    }
                                    i16 = -1;
                                }
                                if (dequeueOutputBuffer == i16) {
                                    if (!z16) {
                                        int dequeueOutputBuffer2 = this.f85121j.dequeueOutputBuffer(this.f85107v, 2500L);
                                        if (dequeueOutputBuffer2 == i16) {
                                            d13 = d12;
                                            z11 = false;
                                        } else if (dequeueOutputBuffer2 != -3 && dequeueOutputBuffer2 != -2) {
                                            if (dequeueOutputBuffer2 >= 0) {
                                                long j18 = this.f85107v.presentationTimeUs;
                                                if (m89552z(i26)) {
                                                    AbstractC20110a.m104535d("surface decoder given buffer " + dequeueOutputBuffer2 + " (size=" + this.f85107v.size + ") (pts=" + j18 + ")", new Object[0]);
                                                }
                                                boolean z27 = this.f85107v.size != 0;
                                                this.f85121j.releaseOutputBuffer(dequeueOutputBuffer2, z27);
                                                if (z27) {
                                                    try {
                                                        this.f85120i.m99102a();
                                                    } catch (Exception e11) {
                                                        i21 = 0;
                                                        AbstractC20110a.m104538g(e11.toString(), new Object[0]);
                                                    }
                                                    if (j11 <= j18) {
                                                        if (this.f85126o.m101629w() != 1 || z17) {
                                                            if (this.f85126o.m101629w() == 0) {
                                                                long j19 = j15 == 0 ? j18 : j15;
                                                                if ((this.f85107v.flags & 4) != 0 || j18 >= j19) {
                                                                    j15 = j19 + AbstractC16778c.f85111u;
                                                                } else {
                                                                    AbstractC20110a.m104535d("current decoderOutputBuffPts=" + j18 + " is less than expectDecoderOutputBuffPts=" + j19, new Object[0]);
                                                                    j15 = j19;
                                                                }
                                                            }
                                                            if (this.f85126o.m101630x() == 1.0f) {
                                                                if (j14 == 0) {
                                                                    j14 = j18;
                                                                }
                                                                this.f85120i.m99103b(false);
                                                                this.f85119h.m99099f(j14 * 1000);
                                                                this.f85119h.m99100g();
                                                                j14 += AbstractC16778c.f85111u;
                                                            } else if (this.f85126o.m101630x() > 1.0f) {
                                                                if (i31 % ((int) this.f85126o.m101630x()) == 0) {
                                                                    if (j14 == 0) {
                                                                        j14 = j18;
                                                                    }
                                                                    this.f85120i.m99103b(false);
                                                                    this.f85119h.m99099f(j14 * 1000);
                                                                    this.f85119h.m99100g();
                                                                    j14 += AbstractC16778c.f85111u;
                                                                } else {
                                                                    z21 = false;
                                                                    z23 = false;
                                                                }
                                                                i31++;
                                                            } else if (this.f85126o.m101630x() < 1.0f) {
                                                                for (int i41 = 0; i41 < ((int) (1.0d / this.f85126o.m101630x())); i41++) {
                                                                    if (j14 == 0) {
                                                                        j12 = 1000;
                                                                        j14 = j18;
                                                                        d12 = (this.f85126o.m101625s() * ((int) (1.0d / this.f85126o.m101630x())) * 1000) + j18;
                                                                    } else {
                                                                        j12 = 1000;
                                                                    }
                                                                    this.f85120i.m99103b(false);
                                                                    this.f85119h.m99099f(j14 * j12);
                                                                    this.f85119h.m99100g();
                                                                    j14 += AbstractC16778c.f85111u;
                                                                }
                                                            }
                                                            long j21 = j14;
                                                            if (m89552z(i26)) {
                                                                AbstractC20110a.m104535d("encoderInputBuffPts: " + j21 + ", pts " + this.f85107v.presentationTimeUs, new Object[0]);
                                                            }
                                                            if (this.f85126o.m101625s() > 0) {
                                                                if ((this.f85126o.m101626t() + this.f85126o.m101625s()) * 1000 < this.f85107v.presentationTimeUs) {
                                                                }
                                                            }
                                                            if (this.f85126o.m101625s() <= 0 || j21 <= d12 || this.f85126o.m101629w() != 1) {
                                                                j14 = j21;
                                                                z13 = z17;
                                                                d13 = d12;
                                                                i21 = 0;
                                                                if ((this.f85107v.flags & 4) != 0) {
                                                                    AbstractC20110a.m104535d("decoder stream end", new Object[i21]);
                                                                    this.f85123l.signalEndOfInputStream();
                                                                    z17 = z13;
                                                                    z11 = false;
                                                                } else {
                                                                    z17 = z13;
                                                                    z11 = z23;
                                                                }
                                                            }
                                                            AbstractC20110a.m104535d("decoder stream end with duration trim", new Object[0]);
                                                            this.f85123l.signalEndOfInputStream();
                                                            j14 = j21;
                                                            d13 = d12;
                                                            i21 = 0;
                                                            z16 = true;
                                                            z13 = true;
                                                            z19 = true;
                                                            z23 = false;
                                                            if ((this.f85107v.flags & 4) != 0) {
                                                            }
                                                        }
                                                    }
                                                    z15 = z22;
                                                    linkedList = linkedList2;
                                                    i14 = i33;
                                                    d13 = d12;
                                                    m101626t = j11;
                                                    z11 = false;
                                                    z21 = false;
                                                } else {
                                                    i21 = 0;
                                                }
                                                z13 = z17;
                                                d13 = d12;
                                                if ((this.f85107v.flags & 4) != 0) {
                                                }
                                            } else {
                                                throw new VideoEncoderException(-1, new IllegalStateException("unexpected result from decoder.dequeueOutputBuffer: " + dequeueOutputBuffer2));
                                            }
                                        }
                                        z15 = z22;
                                        linkedList = linkedList2;
                                        i14 = i33;
                                        m101626t = j11;
                                    }
                                    z11 = z23;
                                    d13 = d12;
                                    z15 = z22;
                                    linkedList = linkedList2;
                                    i14 = i33;
                                    m101626t = j11;
                                }
                                z15 = z22;
                                linkedList = linkedList2;
                                z11 = z23;
                                i14 = i33;
                                d13 = d12;
                                m101626t = j11;
                            }
                        }
                        i15 = i25;
                        z11 = !z16;
                        int i322 = i29;
                        i25 = i15;
                        d13 = d11;
                        boolean z212 = true;
                        while (true) {
                            if (z11) {
                            }
                            boolean z222 = z15;
                            LinkedList linkedList22 = linkedList;
                            boolean z232 = z11;
                            dequeueOutputBuffer = this.f85123l.dequeueOutputBuffer(this.f85107v, 2500L);
                            int i332 = i14;
                            i16 = -1;
                            if (dequeueOutputBuffer != -1) {
                            }
                            if (dequeueOutputBuffer == i16) {
                            }
                            z15 = z222;
                            linkedList = linkedList22;
                            z11 = z232;
                            i14 = i332;
                            d13 = d12;
                            m101626t = j11;
                        }
                    }
                }
            }
            i14 = i13;
            if (this.f85126o.m101629w() != 0) {
                if (i28 <= 0) {
                }
                i15 = i25;
                AbstractC20110a.m104535d("submitted end of stream frame when all packets are traversed", new Object[0]);
                dequeueInputBuffer = this.f85121j.dequeueInputBuffer(2500L);
                if (dequeueInputBuffer >= 0) {
                }
                z11 = !z16;
                int i3222 = i29;
                i25 = i15;
                d13 = d11;
                boolean z2122 = true;
                while (true) {
                    if (z11) {
                    }
                    boolean z2222 = z15;
                    LinkedList linkedList222 = linkedList;
                    boolean z2322 = z11;
                    dequeueOutputBuffer = this.f85123l.dequeueOutputBuffer(this.f85107v, 2500L);
                    int i3322 = i14;
                    i16 = -1;
                    if (dequeueOutputBuffer != -1) {
                    }
                    if (dequeueOutputBuffer == i16) {
                    }
                    z15 = z2222;
                    linkedList = linkedList222;
                    z11 = z2322;
                    i14 = i3322;
                    d13 = d12;
                    m101626t = j11;
                }
            }
            i15 = i25;
            z11 = !z16;
            int i32222 = i29;
            i25 = i15;
            d13 = d11;
            boolean z21222 = true;
            while (true) {
                if (z11) {
                }
                boolean z22222 = z15;
                LinkedList linkedList2222 = linkedList;
                boolean z23222 = z11;
                dequeueOutputBuffer = this.f85123l.dequeueOutputBuffer(this.f85107v, 2500L);
                int i33222 = i14;
                i16 = -1;
                if (dequeueOutputBuffer != -1) {
                }
                if (dequeueOutputBuffer == i16) {
                }
                z15 = z22222;
                linkedList = linkedList2222;
                z11 = z23222;
                i14 = i33222;
                d13 = d12;
                m101626t = j11;
            }
        }
    }

    /* renamed from: x */
    private int m89550x() {
        float m101628v = this.f85126o.m101628v() / this.f85126o.m101630x();
        if (this.f85126o.m101629w() == 2) {
            m101628v *= 6.0f;
        }
        float f11 = m101628v + 1.0f;
        AbstractC20110a.m104535d("estimatedDuration - %s", Float.valueOf(f11));
        return (int) f11;
    }

    /* renamed from: y */
    private boolean m89551y() {
        if (this.f85126o.m101629w() == 0 && this.f85126o.m101630x() == 1.0f && !this.f85126o.m101632z() && !this.f85126o.m101631y()) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    private boolean m89552z(int i11) {
        if (i11 != 0 && (i11 < 10 || i11 % 10 != 0)) {
            return false;
        }
        return true;
    }

    @Override // com.zing.zalo.videoencode.AbstractC16778c
    /* renamed from: a */
    public int mo89540a() {
        int i11;
        m89570r(this.f85126o.m101622p(), this.f85126o.m101621o());
        m89571s(this.f85126o.m101613g());
        m89569q(this.f85126o.m101620n());
        try {
            RunnableC16779d.m89572a(this);
            return 0;
        } catch (Throwable th2) {
            if (th2 instanceof VideoEncoderException) {
                i11 = th2.m89617a();
            } else {
                i11 = -1;
            }
            m89565k(String.format(Locale.US, "[VBE] Exception: error:%s, msg:%s", Integer.valueOf(i11), th2.getMessage()));
            return i11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0367 A[Catch: Exception -> 0x036b, TRY_LEAVE, TryCatch #3 {Exception -> 0x036b, blocks: (B:29:0x0363, B:31:0x0367), top: B:28:0x0363 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0379 A[Catch: Exception -> 0x0382, TRY_LEAVE, TryCatch #20 {Exception -> 0x0382, blocks: (B:35:0x0375, B:37:0x0379), top: B:34:0x0375 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x038f A[Catch: Exception -> 0x0393, TRY_LEAVE, TryCatch #8 {Exception -> 0x0393, blocks: (B:40:0x038b, B:42:0x038f), top: B:39:0x038b }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03a0 A[Catch: Exception -> 0x03a9, TRY_LEAVE, TryCatch #5 {Exception -> 0x03a9, blocks: (B:45:0x039c, B:47:0x03a0), top: B:44:0x039c }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x03b6 A[Catch: Exception -> 0x03bf, TRY_LEAVE, TryCatch #12 {Exception -> 0x03bf, blocks: (B:50:0x03b2, B:52:0x03b6), top: B:49:0x03b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03cc A[Catch: Exception -> 0x03d5, TRY_LEAVE, TryCatch #7 {Exception -> 0x03d5, blocks: (B:55:0x03c8, B:57:0x03cc), top: B:54:0x03c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03e2 A[Catch: Exception -> 0x03eb, TRY_LEAVE, TryCatch #2 {Exception -> 0x03eb, blocks: (B:60:0x03de, B:62:0x03e2), top: B:59:0x03de }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03f5 A[Catch: Exception -> 0x03f9, TRY_LEAVE, TryCatch #15 {Exception -> 0x03f9, blocks: (B:65:0x03f1, B:67:0x03f5), top: B:64:0x03f1 }] */
    /* JADX WARN: Type inference failed for: r1v16, types: [android.media.MediaCodec, ff0.b, android.media.MediaMuxer, android.media.MediaExtractor, ff0.a] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v40 */
    @Override // com.zing.zalo.videoencode.AbstractC16778c
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo89541d() {
        Object obj;
        String str;
        Object obj2;
        int i11;
        Throwable th2;
        ?? r12;
        Exception exc;
        C18904a c18904a;
        MediaMuxer mediaMuxer;
        MediaCodec mediaCodec;
        MediaCodec mediaCodec2;
        MediaCodec mediaCodec3;
        C18905b c18905b;
        MediaCodec mediaCodec4;
        MediaExtractor mediaExtractor;
        ByteBuffer byteBuffer;
        MediaFormat mediaFormat;
        int m101612f;
        Exception exc2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("src", this.f85126o.m101613g());
        jSONObject.put("dst", this.f85126o.m101620n());
        jSONObject.put("rotation", this.f85126o.m101623q());
        jSONObject.put("oriWidth", this.f85126o.m101619m());
        jSONObject.put("oriHeight", this.f85126o.m101618l());
        jSONObject.put("resWidth", this.f85126o.m101622p());
        jSONObject.put("resHeight", this.f85126o.m101621o());
        jSONObject.put("bitrate", this.f85126o.m101627u());
        jSONObject.put("frameRate", this.f85126o.m101611e());
        jSONObject.put("iframeInterval", this.f85126o.m101612f());
        jSONObject.put("duration", this.f85126o.m101628v());
        jSONObject.put("audioCodec", this.f85126o.m101609c());
        jSONObject.put("videoMode", this.f85126o.m101629w());
        jSONObject.put(ZMediaPlayer.OPTION_PLAYER_KEY_NUMBER_OF_LOOP, this.f85126o.m101616j());
        jSONObject.put("speed", this.f85126o.m101630x());
        jSONObject.put("trimStart", this.f85126o.m101626t());
        jSONObject.put("forceI", this.f85126o.m101632z() ? 1 : 0);
        jSONObject.put("mute", this.f85126o.m101631y());
        m89565k("[VBE] Transcode config: " + jSONObject);
        if (this.f85112a != 0 && this.f85113b != 0) {
            m89565k("[VBE] Start transcode");
            if (this.f85126o.m101610d() != null) {
                this.f85126o.m101610d().mo50440f(3);
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.f85108w = m89550x();
            this.f85117f = null;
            this.f85120i = null;
            this.f85121j = null;
            this.f85123l = null;
            this.f85125n = null;
            this.f85119h = null;
            this.f85129r = false;
            this.f85107v = null;
            try {
                this.f85125n = m89561c();
                this.f85117f = m89560b();
                this.f85107v = new MediaCodec.BufferInfo();
                int m89547A = m89547A(false);
                try {
                    int m89547A2 = m89547A(true);
                    if (m89547A == -1) {
                        str = "error while releasing inputSurface";
                        obj2 = null;
                        i11 = 0;
                        try {
                            throw new VideoEncoderException(-1, new IllegalStateException("missing video track in test video"));
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } else {
                        if (m89547A2 == -1) {
                            try {
                                AbstractC20110a.m104538g("missing audio track in test video", new Object[0]);
                            } catch (Throwable th4) {
                                th2 = th4;
                                str = "error while releasing inputSurface";
                                r12 = 0;
                                i11 = 0;
                            }
                        }
                        if (m89547A2 >= 0 && !m89551y()) {
                            MediaFormat trackFormat = this.f85117f.getTrackFormat(m89547A2);
                            byteBuffer = ByteBuffer.allocateDirect(trackFormat.getInteger("max-input-size"));
                            mediaFormat = trackFormat;
                        } else {
                            byteBuffer = null;
                            mediaFormat = null;
                        }
                        AbstractC16778c.f85111u = 1000000 / this.f85126o.m101611e();
                        MediaFormat trackFormat2 = this.f85117f.getTrackFormat(m89547A);
                        if (trackFormat2.containsKey("rotation-degrees")) {
                            trackFormat2.setInteger("rotation-degrees", 0);
                        }
                        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", this.f85112a, this.f85113b);
                        createVideoFormat.setInteger("color-format", 2130708361);
                        createVideoFormat.setInteger("bitrate", this.f85126o.m101627u());
                        createVideoFormat.setInteger("frame-rate", this.f85126o.m101611e());
                        if (this.f85126o.m101632z()) {
                            m101612f = 0;
                        } else {
                            m101612f = this.f85126o.m101612f();
                        }
                        createVideoFormat.setInteger("i-frame-interval", m101612f);
                        createVideoFormat.setString("Manufacturer", "Zalo Group");
                        AbstractC20110a.m104535d("video format: %s", createVideoFormat);
                        AtomicReference atomicReference = new AtomicReference();
                        try {
                            this.f85123l = m89554v(null, createVideoFormat, atomicReference);
                            C18904a c18904a2 = new C18904a((Surface) atomicReference.get());
                            this.f85119h = c18904a2;
                            c18904a2.m99096c();
                            C18905b c18905b2 = new C18905b(this.f85126o.m101624r());
                            this.f85120i = c18905b2;
                            this.f85121j = m89553u(trackFormat2, c18905b2.m99104c());
                            this.f85117f.selectTrack(m89547A);
                            this.f85117f.seekTo(this.f85126o.m101626t() * 1000, 0);
                            i11 = 0;
                            try {
                                m89549w(byteBuffer, m89547A, m89547A2, trackFormat2, mediaFormat);
                                try {
                                    MediaExtractor mediaExtractor2 = this.f85117f;
                                    if (mediaExtractor2 != null) {
                                        mediaExtractor2.release();
                                    }
                                    exc2 = null;
                                } catch (Exception e11) {
                                    exc2 = e11;
                                    AbstractC20110a.m104540i(exc2, "error while releasing videoExtractor", new Object[0]);
                                }
                                try {
                                    MediaCodec mediaCodec5 = this.f85121j;
                                    if (mediaCodec5 != null) {
                                        mediaCodec5.stop();
                                        this.f85121j.release();
                                    }
                                } catch (Exception e12) {
                                    AbstractC20110a.m104540i(e12, "error while releasing videoDecoder", new Object[0]);
                                    if (exc2 == null) {
                                        exc2 = e12;
                                    }
                                }
                                try {
                                    C18905b c18905b3 = this.f85120i;
                                    if (c18905b3 != null) {
                                        c18905b3.m99105d();
                                    }
                                } catch (Exception e13) {
                                    AbstractC20110a.m104540i(e13, "error while releasing outputSurface", new Object[0]);
                                    if (exc2 == null) {
                                        exc2 = e13;
                                    }
                                }
                                try {
                                    MediaCodec mediaCodec6 = this.f85123l;
                                    if (mediaCodec6 != null) {
                                        mediaCodec6.stop();
                                        this.f85123l.release();
                                    }
                                } catch (Exception e14) {
                                    AbstractC20110a.m104540i(e14, "error while releasing videoEncoder", new Object[0]);
                                    if (exc2 == null) {
                                        exc2 = e14;
                                    }
                                }
                                try {
                                    MediaCodec mediaCodec7 = this.f85122k;
                                    if (mediaCodec7 != null) {
                                        mediaCodec7.stop();
                                        this.f85122k.release();
                                    }
                                } catch (Exception e15) {
                                    AbstractC20110a.m104540i(e15, "error while releasing audioDecoder", new Object[0]);
                                    if (exc2 == null) {
                                        exc2 = e15;
                                    }
                                }
                                try {
                                    MediaCodec mediaCodec8 = this.f85124m;
                                    if (mediaCodec8 != null) {
                                        mediaCodec8.stop();
                                        this.f85124m.release();
                                    }
                                } catch (Exception e16) {
                                    AbstractC20110a.m104540i(e16, "error while releasing audioEncoder", new Object[0]);
                                    if (exc2 == null) {
                                        exc2 = e16;
                                    }
                                }
                                try {
                                    MediaMuxer mediaMuxer2 = this.f85125n;
                                    if (mediaMuxer2 != null) {
                                        mediaMuxer2.stop();
                                        this.f85125n.release();
                                    }
                                } catch (Exception e17) {
                                    AbstractC20110a.m104540i(e17, "error while releasing muxer", new Object[0]);
                                    if (exc2 == null) {
                                        exc2 = e17;
                                    }
                                }
                                try {
                                    C18904a c18904a3 = this.f85119h;
                                    if (c18904a3 != null) {
                                        c18904a3.m99097d();
                                    }
                                } catch (Exception e18) {
                                    AbstractC20110a.m104540i(e18, "error while releasing inputSurface", new Object[0]);
                                    if (exc2 == null) {
                                        exc2 = e18;
                                    }
                                }
                                this.f85117f = null;
                                this.f85120i = null;
                                this.f85119h = null;
                                this.f85121j = null;
                                this.f85122k = null;
                                this.f85123l = null;
                                this.f85124m = null;
                                this.f85125n = null;
                                if (exc2 == null) {
                                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                                    m89565k(String.format(Locale.US, "[VBE] Encode time: %s (millisecond)", Long.valueOf(currentTimeMillis2)));
                                    long m101625s = this.f85126o.m101625s();
                                    if (m101625s == 0) {
                                        m101625s = this.f85108w * 1000;
                                    }
                                    m89564j(currentTimeMillis2, m101625s, 16304);
                                    return;
                                }
                                throw new VideoEncoderException(-1, exc2);
                            } catch (Throwable th5) {
                                th = th5;
                                str = "error while releasing inputSurface";
                                obj2 = null;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            obj = null;
                            str = "error while releasing inputSurface";
                            obj2 = obj;
                            i11 = 0;
                            th2 = th;
                            r12 = obj2;
                            mediaExtractor = this.f85117f;
                            if (mediaExtractor != null) {
                            }
                            exc = r12;
                            mediaCodec4 = this.f85121j;
                            if (mediaCodec4 != null) {
                            }
                            c18905b = this.f85120i;
                            if (c18905b != null) {
                            }
                            mediaCodec3 = this.f85123l;
                            if (mediaCodec3 != null) {
                            }
                            mediaCodec2 = this.f85122k;
                            if (mediaCodec2 != null) {
                            }
                            mediaCodec = this.f85124m;
                            if (mediaCodec != null) {
                            }
                            mediaMuxer = this.f85125n;
                            if (mediaMuxer != null) {
                            }
                            c18904a = this.f85119h;
                            if (c18904a != null) {
                            }
                            this.f85117f = r12;
                            this.f85120i = r12;
                            this.f85119h = r12;
                            this.f85121j = r12;
                            this.f85122k = r12;
                            this.f85123l = r12;
                            this.f85124m = r12;
                            this.f85125n = r12;
                            throw th2;
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    str = "error while releasing inputSurface";
                    obj2 = null;
                    i11 = 0;
                    th2 = th;
                    r12 = obj2;
                    mediaExtractor = this.f85117f;
                    if (mediaExtractor != null) {
                    }
                    exc = r12;
                    mediaCodec4 = this.f85121j;
                    if (mediaCodec4 != null) {
                    }
                    c18905b = this.f85120i;
                    if (c18905b != null) {
                    }
                    mediaCodec3 = this.f85123l;
                    if (mediaCodec3 != null) {
                    }
                    mediaCodec2 = this.f85122k;
                    if (mediaCodec2 != null) {
                    }
                    mediaCodec = this.f85124m;
                    if (mediaCodec != null) {
                    }
                    mediaMuxer = this.f85125n;
                    if (mediaMuxer != null) {
                    }
                    c18904a = this.f85119h;
                    if (c18904a != null) {
                    }
                    this.f85117f = r12;
                    this.f85120i = r12;
                    this.f85119h = r12;
                    this.f85121j = r12;
                    this.f85122k = r12;
                    this.f85123l = r12;
                    this.f85124m = r12;
                    this.f85125n = r12;
                    throw th2;
                }
            } catch (Throwable th8) {
                th = th8;
                obj = null;
            }
            th2 = th;
            r12 = obj2;
            try {
                mediaExtractor = this.f85117f;
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
                exc = r12;
            } catch (Exception e19) {
                AbstractC20110a.m104540i(e19, "error while releasing videoExtractor", new Object[i11]);
                exc = e19;
            }
            try {
                mediaCodec4 = this.f85121j;
                if (mediaCodec4 != null) {
                    mediaCodec4.stop();
                    this.f85121j.release();
                }
            } catch (Exception e21) {
                AbstractC20110a.m104540i(e21, "error while releasing videoDecoder", new Object[i11]);
                if (exc == null) {
                    exc = e21;
                }
            }
            try {
                c18905b = this.f85120i;
                if (c18905b != null) {
                    c18905b.m99105d();
                }
            } catch (Exception e22) {
                AbstractC20110a.m104540i(e22, "error while releasing outputSurface", new Object[i11]);
                if (exc == null) {
                    exc = e22;
                }
            }
            try {
                mediaCodec3 = this.f85123l;
                if (mediaCodec3 != null) {
                    mediaCodec3.stop();
                    this.f85123l.release();
                }
            } catch (Exception e23) {
                AbstractC20110a.m104540i(e23, "error while releasing videoEncoder", new Object[i11]);
                if (exc == null) {
                    exc = e23;
                }
            }
            try {
                mediaCodec2 = this.f85122k;
                if (mediaCodec2 != null) {
                    mediaCodec2.stop();
                    this.f85122k.release();
                }
            } catch (Exception e24) {
                AbstractC20110a.m104540i(e24, "error while releasing audioDecoder", new Object[i11]);
                if (exc == null) {
                    exc = e24;
                }
            }
            try {
                mediaCodec = this.f85124m;
                if (mediaCodec != null) {
                    mediaCodec.stop();
                    this.f85124m.release();
                }
            } catch (Exception e25) {
                AbstractC20110a.m104540i(e25, "error while releasing audioEncoder", new Object[i11]);
                if (exc == null) {
                }
            }
            try {
                mediaMuxer = this.f85125n;
                if (mediaMuxer != null) {
                    mediaMuxer.stop();
                    this.f85125n.release();
                }
            } catch (Exception e26) {
                AbstractC20110a.m104540i(e26, "error while releasing muxer", new Object[i11]);
            }
            try {
                c18904a = this.f85119h;
                if (c18904a != null) {
                    c18904a.m99097d();
                }
            } catch (Exception e27) {
                AbstractC20110a.m104540i(e27, str, new Object[i11]);
            }
            this.f85117f = r12;
            this.f85120i = r12;
            this.f85119h = r12;
            this.f85121j = r12;
            this.f85122k = r12;
            this.f85123l = r12;
            this.f85124m = r12;
            this.f85125n = r12;
            throw th2;
        }
        throw new VideoEncoderException(-1, new IllegalStateException(String.format("width (%d) and/or height (%d) is invalid.", Integer.valueOf(this.f85112a), Integer.valueOf(this.f85113b))));
    }

    /* renamed from: u */
    protected MediaCodec m89553u(MediaFormat mediaFormat, Surface surface) {
        MediaCodec mediaCodec;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 22) {
            mediaCodec = m89548t(mediaFormat, surface);
        } else {
            mediaCodec = null;
        }
        if (mediaCodec == null) {
            MediaCodec createDecoderByType = MediaCodec.createDecoderByType(mediaFormat.getString("mime"));
            createDecoderByType.configure(mediaFormat, surface, (MediaCrypto) null, 0);
            String name = createDecoderByType.getName();
            if (i11 >= 29) {
                name = createDecoderByType.getCanonicalName();
            }
            m89565k(String.format("[VBE] Picked codec %s (%s) by type %s for decoding", name, createDecoderByType.getName(), mediaFormat.getString("mime")));
            mediaCodec = createDecoderByType;
        }
        mediaCodec.start();
        return mediaCodec;
    }

    /* renamed from: v */
    protected MediaCodec m89554v(MediaCodecInfo mediaCodecInfo, MediaFormat mediaFormat, AtomicReference atomicReference) {
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType("video/avc");
        createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
        String name = createEncoderByType.getName();
        if (Build.VERSION.SDK_INT >= 29) {
            name = createEncoderByType.getCanonicalName();
        }
        m89565k(String.format("[VBE] Picked codec %s (%s) by type %s for encoding", name, createEncoderByType.getName(), "video/avc"));
        atomicReference.set(createEncoderByType.createInputSurface());
        createEncoderByType.start();
        return createEncoderByType;
    }
}
