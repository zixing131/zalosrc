package i60;

import android.content.Intent;
import com.zing.zalo.data.entity.chat.message.MessageId;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: i60.n */
/* loaded from: classes5.dex */
public final class C20348n {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final MessageId f100344a;

    /* renamed from: i60.n$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C20348n m106084a(Intent intent) {
            if (intent != null) {
                return new C20348n((MessageId) intent.getParcelableExtra("extra_msg_id"));
            }
            return null;
        }
    }

    public C20348n(MessageId messageId) {
        this.f100344a = messageId;
    }

    /* renamed from: a */
    public static final C20348n m106082a(Intent intent) {
        return Companion.m106084a(intent);
    }

    /* renamed from: b */
    public final MessageId m106083b() {
        return this.f100344a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20348n) && AbstractC19074t.m100204b(this.f100344a, ((C20348n) obj).f100344a);
    }

    public int hashCode() {
        MessageId messageId = this.f100344a;
        if (messageId == null) {
            return 0;
        }
        return messageId.hashCode();
    }

    public String toString() {
        return "OpenPinBoardViewResult(messageId=" + this.f100344a + ")";
    }
}
