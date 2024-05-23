package com.zing.zalocore.connection.socket;

import com.zing.zalo.utils.Keep;
import java.util.ArrayList;

@Deprecated
/* loaded from: classes7.dex */
public class AckGroup {

    /* renamed from: a */
    private ArrayList f89246a = new ArrayList();

    /* renamed from: b */
    private int f89247b;

    /* renamed from: com.zing.zalocore.connection.socket.AckGroup$a */
    /* loaded from: classes7.dex */
    public static class C17513a {

        /* renamed from: a */
        public int f89248a;

        /* renamed from: b */
        public long f89249b;

        public C17513a(int i11, long j11) {
            this.f89248a = i11;
            this.f89249b = j11;
        }
    }

    @Keep
    public AckGroup(int i11) {
        this.f89247b = i11;
    }

    @Keep
    public void add(int i11, long j11) {
        this.f89246a.add(new C17513a(i11, j11));
    }
}
