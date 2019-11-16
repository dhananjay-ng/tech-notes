version 1.0

- *peer* v/s *client*: In this document, a *peer* is any BitTorrent client participating in a download. The *client* is also a peer, however it is the BitTorrent client that is running on the local machine. Readers of this specification may choose to think of themselves as the *client* which connects to numerous *peers*.
- *piece* v/s *block*: In this document, a *piece* refers to a portion of the downloaded data that is described in the metainfo file, which can be verified by a SHA1 hash. A *block* is a portion of data that a *client* may request from a *peer*. Two or more *blocks* make up a whole *piece*, which may then be verified.

